package TheConstantsSampler.Readers;

import TheConstantsSampler.LabTests.TestData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReaderForLabtests implements Reader{
    private String COMMA_DELIMITER = ",";
    private String path;

    public CSVReaderForLabtests(String path){
        this.path = path;
    }

    private TestData labtestConst(String[] data){
        int IDNum = Integer.parseInt(data[0]);
        int IDType = Integer.parseInt(data[1]);
        String FirstName = data[2];
        String LastName = data[3];
        String ResultDate = data[4];
        String BirthDate = data[5];
        String Labcode = data[6];
        String StickerNumber = data[7];
        int ResultTestCorona = Integer.parseInt(data[8]);
        String Variant = data[9];
        String TestType = data[10];

        return new TestData(IDNum, IDType, FirstName, LastName, ResultDate, BirthDate, Labcode, StickerNumber, ResultTestCorona, Variant, TestType);
    }

    public ArrayList<TestData> readLabtest() throws IOException {
        ArrayList<TestData> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            //to skip the first line with the properties
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                records.add(labtestConst(values));
            }
        }
        return records;
    }
}
