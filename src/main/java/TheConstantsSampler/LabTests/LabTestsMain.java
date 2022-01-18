package TheConstantsSampler.LabTests;

import TheConstantsSampler.Enrichment.CSVLabtestEnricher;
import TheConstantsSampler.Readers.CSVReaderForLabtests;
import TheConstantsSampler.Writers.XMLWriter;
import health_care_provider.errors.InvalidIdException;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LabTestsMain {
    public static void main(String[] args) throws IOException, InvalidIdException {
        CSVReaderForLabtests a = new CSVReaderForLabtests("D:\\Code\\TheConstantSampler\\src\\main\\resources\\LabTests.csv");
        CSVLabtestEnricher b = new CSVLabtestEnricher();
        ArrayList<TestData> tests_enriched = new ArrayList<TestData>();
        XMLWriter c = new XMLWriter();
        Wrapper wrapper = new Wrapper();


        for (int i = 0; i < a.readLabtest().size(); i++) {
            try {
                LocalDate JOIN_DATE = b.enrich(a.readLabtest().get(i).getIDNum(), a.readLabtest().get(i).getIDType()).getJoinDate();
                int HEALTH_CARD_ID = b.enrich(a.readLabtest().get(i).getIDNum(), a.readLabtest().get(i).getIDType()).getHealthCareId();
                String HEALTH_CARD_NAME = b.enrich(a.readLabtest().get(i).getIDNum(), a.readLabtest().get(i).getIDType()).getHealthCareName();
                TestData temp = new TestData(a.readLabtest().get(i).getIDNum(), a.readLabtest().get(i).getIDType(), a.readLabtest().get(i).getFirstName(), a.readLabtest().get(i).getLastName(), a.readLabtest().get(i).getResultDate(), a.readLabtest().get(i).getBirthDate(), a.readLabtest().get(i).getLabcode(), a.readLabtest().get(i).getStickerNumber(), a.readLabtest().get(i).getResultTestCorona(), a.readLabtest().get(i).getVariant(), a.readLabtest().get(i).getTestType(),JOIN_DATE, HEALTH_CARD_ID, HEALTH_CARD_NAME);
                tests_enriched.add(temp);
                wrapper.addTests(tests_enriched);
            }catch (Exception ex){
                System.out.println("sample number " + i +" has incorrect ID");
                TestData temp = new TestData(a.readLabtest().get(i).getIDNum(), a.readLabtest().get(i).getIDType(), a.readLabtest().get(i).getFirstName(), a.readLabtest().get(i).getLastName(), a.readLabtest().get(i).getResultDate(), a.readLabtest().get(i).getBirthDate(), a.readLabtest().get(i).getLabcode(), a.readLabtest().get(i).getStickerNumber(), a.readLabtest().get(i).getResultTestCorona(), a.readLabtest().get(i).getVariant(), a.readLabtest().get(i).getTestType());
                temp.setInvalid(true);
                temp.setHEALTH_CARD_ID(-1);
                temp.setHEALTH_CARD_NAME(null);
                temp.setJOIN_DATE(null);
                tests_enriched.add(temp);
                wrapper.addTests(tests_enriched);
            }

            //TestData temp = new TestData(a.readLabtest().get(i).getIDNum(), a.readLabtest().get(i).getIDType(), a.readLabtest().get(i).getFirstName(), a.readLabtest().get(i).getLastName(), a.readLabtest().get(i).getResultDate(), a.readLabtest().get(i).getBirthDate(), a.readLabtest().get(i).getLabcode(), a.readLabtest().get(i).getStickerNumber(), a.readLabtest().get(i).getResultTestCorona(), a.readLabtest().get(i).getVariant(), a.readLabtest().get(i).getTestType());

            //tests_enriched.add(temp);
            //wrapper.addTests(temp);
            //temp.append(temp);
        }

        c.write(wrapper.getTests());





    }
}