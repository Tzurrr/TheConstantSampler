package TheConstantsSampler.Writers;

import TheConstantsSampler.LabTests.TestData;
import TheConstantsSampler.Monitors.CSVMonitor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class XMLWriter implements Writer{
    XmlMapper xmlMapper = new XmlMapper();

    private int counter = 0;
    private CSVMonitor mon = new CSVMonitor();
    private File path = new File("D:\\Code\\TheConstantSampler\\src\\main\\resources\\LABTESTS\\labtest_n" + this.counter + ".XML");


    public void write(ArrayList<TestData> labTest) throws IOException {
        xmlMapper.findAndRegisterModules();
        int inner_counter = 0;
        TestData[] temp = new TestData[labTest.size()];

        if(labTest.size() > 50000){
            int split_to = mon.split(labTest.size());
            //ArrayList<TestData> temp = new ArrayList<TestData>();

            for (int i = 0; i <split_to; i++) {

                while (inner_counter < 50000){
                    temp[inner_counter] = labTest.get(0);
                    inner_counter++;
                    labTest.remove(0);
                }
                xmlMapper.writeValue(this.path, temp);
                this.counter++;
                this.path = new File("D:\\Code\\TheConstantSampler\\src\\main\\resources\\LABTESTS\\labtest_n" + this.counter + ".XML");
                inner_counter = 0;
                temp = new TestData[labTest.size()];
            }
        }
        else {
            ///xmlMapper.writeValue(this.path, labTest);
            for (int i = 0; i < labTest.size(); i++) {
                temp[i] = labTest.get(i);
            }
            xmlMapper.writeValue(this.path, temp);
        }
    }
}
