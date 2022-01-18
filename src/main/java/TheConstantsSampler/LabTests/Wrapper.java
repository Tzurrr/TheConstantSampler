package TheConstantsSampler.LabTests;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//@JacksonXmlRootElement(localName = "tests")

@JacksonXmlRootElement
public class Wrapper {

    //@JacksonXmlProperty(localName = "labTest")
    //@JacksonXmlElementWrapper(localName = "mytest")
    //@JacksonXmlElementWrapper(useWrapping = false)
    private List<TestData> tests = new ArrayList<>();

    public void addTests(List<TestData> tests){
        this.tests = tests;
    }

    public List<TestData> getTests(){
        return tests;
    }

}
