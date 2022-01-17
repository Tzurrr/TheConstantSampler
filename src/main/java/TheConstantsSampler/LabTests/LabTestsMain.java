package TheConstantsSampler.LabTests;

import TheConstantsSampler.Readers.CSVReaderForLabtests;

import java.io.IOException;

public class LabTestsMain {
    public static void main(String[] args) throws IOException{
        CSVReaderForLabtests a = new CSVReaderForLabtests("D:\\Code\\TheConstantSampler\\src\\main\\resources\\LabTests.csv");
        for (int i = 0; i < a.readLabtest().size(); i++) {
            System.out.println(a.readLabtest().get(i).getIDNum());
            System.out.println(a.readLabtest().get(i).getIDType());
            System.out.println(a.readLabtest().get(i).getFirstName());
            System.out.println(a.readLabtest().get(i).getLastName());
            System.out.println(a.readLabtest().get(i).getResultDate());
            System.out.println(a.readLabtest().get(i).getBirthDate());
            System.out.println(a.readLabtest().get(i).getLabcode());
            System.out.println(a.readLabtest().get(i).getStickerNumber());
            System.out.println(a.readLabtest().get(i).getResultTestCorona());
            System.out.println(a.readLabtest().get(i).getVariant());
            System.out.println(a.readLabtest().get(i).getTestType());
        }
    }
}
