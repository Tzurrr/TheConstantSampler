package TheConstantsSampler.MadaSampels;

import TheConstantsSampler.Readers.CSVReader;
import TheConstantsSampler.Writers.JSONWriter;

import java.io.IOException;

public class MadaReportsMain{
    public static void main(String[] args) throws IOException {
        CSVReader a = new CSVReader("D:\\Code\\TheConstantSampler\\src\\main\\resources\\MadaReports.csv");
        JSONWriter writer = new JSONWriter();
        writer.write(a.readSampels());

    }
}
