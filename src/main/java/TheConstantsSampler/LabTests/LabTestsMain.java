package TheConstantsSampler.LabTests;

import TheConstantsSampler.Enrichment.CSVLabtestEnricher;
import TheConstantsSampler.Readers.CSVReaderForLabtests;
import TheConstantsSampler.Writers.XMLWriter;
import health_care_provider.errors.InvalidIdException;

import java.io.IOException;
import java.util.ArrayList;

public class LabTestsMain {
    public static void main(String[] args) throws IOException, InvalidIdException {
        CSVReaderForLabtests a = new CSVReaderForLabtests("D:\\Code\\TheConstantSampler\\src\\main\\resources\\LabTests.csv");
        CSVLabtestEnricher b = new CSVLabtestEnricher();
        ArrayList<TestData> tests_enriched = new ArrayList<TestData>();
        XMLWriter c = new XMLWriter();

        for (int i = 0; i < a.readLabtest().size(); i++) {
            TestData temp = new TestData(a.readLabtest().get(i).getIDNum(), a.readLabtest().get(i).getIDType(), a.readLabtest().get(i).getFirstName(), a.readLabtest().get(i).getLastName(), a.readLabtest().get(i).getResultDate(), a.readLabtest().get(i).getBirthDate(), a.readLabtest().get(i).getLabcode(), a.readLabtest().get(i).getStickerNumber(), a.readLabtest().get(i).getResultTestCorona(), a.readLabtest().get(i).getVariant(), a.readLabtest().get(i).getTestType(), b.enrich(a.readLabtest().get(i).getIDNum(), a.readLabtest().get(i).getIDType()).getJoinDate(), b.enrich(a.readLabtest().get(i).getIDNum(), a.readLabtest().get(i).getIDType()).getHealthCareId(), b.enrich(a.readLabtest().get(i).getIDNum(), a.readLabtest().get(i).getIDType()).getHealthCareName());
            tests_enriched.add(temp);
        }
        c.write(tests_enriched);
    }
}