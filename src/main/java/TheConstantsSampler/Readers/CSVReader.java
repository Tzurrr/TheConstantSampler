package TheConstantsSampler.Readers;

import TheConstantsSampler.MadaSampels.ReportData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader implements Reader{
    private String COMMA_DELIMITER = ",";
    private String path;

    public CSVReader(String path){
        this.path = path;
    }

    public ReportData sampleConst(String[] data){
        String MDACODE = data[0];
        String IDNum = data[1];
        String IDType = data[2];
        String FirstName = data[3];
        String LastName = data[4];
        String City = data[5];
        String Street = data[6];
        String BuildingNumber = data[7];
        String Barcode = data[8];
        String GetDate = data[9];
        String TakeDate = data[10];
        String ResultDate = data[11];

        return new ReportData(MDACODE, IDNum, IDType, FirstName, LastName, City, Street, BuildingNumber, Barcode, GetDate, TakeDate, ResultDate);
    }

    public ArrayList<ReportData> readSampels() throws IOException {
        ArrayList<ReportData> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                records.add(sampleConst(values));
            }
        }
        return records;
    }
}
