package TheConstantsSampler.Writers;

import TheConstantsSampler.LabTests.TestData;
import TheConstantsSampler.Monitors.CSVMonitor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLWriter implements Writer{
    XmlMapper xmlMapper = new XmlMapper();

    private int counter = 0;
    private CSVMonitor mon = new CSVMonitor();
    private File path = new File("D:\\Code\\TheConstantSampler\\src\\main\\resources\\LABTESTS\\labtest_n" + this.counter + ".XML");


    public void write(List<TestData> testsData) throws IOException {
        xmlMapper.findAndRegisterModules();
        int inner_counter = 0;
        //TestData[] temp = new TestData[testsData.size()];

        if(testsData.size() > 50000){
            int split_to = mon.split(testsData.size());
            ArrayList<TestData> temp = new ArrayList<TestData>();

            for (int i = 0; i <split_to; i++) {

                while (inner_counter < 50000){
                    temp.add(testsData.get(0));
                    testsData.remove(0);
                    inner_counter++;
                }
                xmlMapper.writeValue(this.path, temp);
                this.counter++;
                this.path = new File("D:\\Code\\TheConstantSampler\\src\\main\\resources\\LABTESTS\\labtest_n" + this.counter + ".XML");
                inner_counter = 0;
                temp = new ArrayList<TestData>();
                //temp = new TestData[testsData.size()];
            }
        }
        else {
            ///xmlMapper.writeValue(this.path, testsData);
//            for (int i = 0; i < testsData.size(); i++) {
//                temp[i] = testsData.get(i);
//            }
//            for (int i = 0; i < testsData.size(); i++) {
//                //xmlMapper.writeValue(this.path, testsData.get(i).get(0));
//                //xmlMapper.writeValue(this.path, testsData.get(i).get(0));
//            }
            xmlMapper.writeValue(this.path, testsData);
        }
    }
}
