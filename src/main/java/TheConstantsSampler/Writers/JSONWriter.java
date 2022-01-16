package TheConstantsSampler.Writers;

import TheConstantsSampler.MadaSampels.ReportData;
import TheConstantsSampler.Monitors.CSVMonitor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JSONWriter {
    private ObjectMapper objectMapper = new ObjectMapper();
    private int counter = 0;
    private CSVMonitor mon = new CSVMonitor();
    private File path = new File("D:\\Code\\TheConstantSampler\\src\\main\\resources\\mada_reports\\report_n" + this.counter + ".json");

    public void write(ArrayList<ReportData> data) throws IOException {
        int inter_counter = 0;

        if(data.size() > 50000){
            int split_to = mon.split(data.size());
            ArrayList<ReportData> temp = new ArrayList<ReportData>();

            for (int i = 0; i <split_to; i++) {

                while (inter_counter < 50000){
                    temp.add(data.get(inter_counter));
                    inter_counter++;
                }
                objectMapper.writeValue(this.path, temp);
                this.counter++;
                this.path = new File("D:\\Code\\TheConstantSampler\\src\\main\\resources\\mada_reports\\report_n" + this.counter + ".json");
                inter_counter = 0;
            }
        }

        else {
            objectMapper.writeValue(this.path, data);
        }



    }
}
