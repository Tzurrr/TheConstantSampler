package TheConstantsSampler.LabTests;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import health_care_provider.models.PersonInsured;
import java.time.LocalDate;


@JacksonXmlRootElement(localName = "labTests")
public class TestData {

    //@JacksonXmlProperty
    private int IDNum;
    //@JacksonXmlProperty
    private int IDType;
    //@JacksonXmlProperty
    private String FirstName;
    //@JacksonXmlProperty
    private String LastName;
    //@JacksonXmlProperty
    private String ResultDate;
    //@JacksonXmlProperty
    private String BirthDate;
    //@JacksonXmlProperty
    private String Labcode;
    //@JacksonXmlProperty
    private String StickerNumber;
    //@JacksonXmlProperty
    private int ResultTestCorona;
    //@JacksonXmlProperty
    private String Variant;
    //@JacksonXmlProperty
    private String TestType;

    //@JacksonXmlProperty
    private LocalDate JOIN_DATE;
    //@JacksonXmlProperty
    private int HEALTH_CARD_ID;
    //@JacksonXmlProperty
    private String HEALTH_CARD_NAME;

    //@JacksonXmlProperty
    private boolean invalid;

    public TestData(int IDNum, int IDType, String FirstName, String LastName, String ResultDate, String BirthDate, String Labcode, String StickerNumber, int ResultTestCorona, String Variant, String TestType){
        this.IDNum = IDNum;
        this.IDType = IDType;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.ResultDate = ResultDate;
        this.BirthDate = BirthDate;
        this.Labcode = Labcode;
        this.StickerNumber = StickerNumber;
        this.ResultTestCorona = ResultTestCorona;
        this.Variant = Variant;
        this.TestType = TestType;
    }

    public TestData(int IDNum, int IDType, String FirstName, String LastName, String ResultDate, String BirthDate, String Labcode, String StickerNumber, int ResultTestCorona, String Variant, String TestType, LocalDate JOIN_DATE, int HEALTH_CARD_ID, String HEALTH_CARD_NAME){
        this.IDNum = IDNum;
        this.IDType = IDType;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.ResultDate = ResultDate;
        this.BirthDate = BirthDate;
        this.Labcode = Labcode;
        this.StickerNumber = StickerNumber;
        this.ResultTestCorona = ResultTestCorona;
        this.Variant = Variant;
        this.TestType = TestType;

        this.JOIN_DATE = JOIN_DATE;
        this.HEALTH_CARD_ID = HEALTH_CARD_ID;
        this.HEALTH_CARD_NAME = HEALTH_CARD_NAME;

    }

    public void setInvalid(boolean isInvalid){
        this.invalid = isInvalid;
    }

    public TestData(TestData a, PersonInsured b){
        this.IDNum = a.getIDNum();
        this.IDType = a.getIDType();
        this.FirstName = a.getFirstName();
        this.LastName = a.getLastName();
        this.ResultDate = a.getResultDate();
        this.BirthDate = a.getBirthDate();
        this.Labcode = a.getLabcode();
        this.StickerNumber = a.getStickerNumber();
        this.ResultTestCorona = a.getResultTestCorona();
        this.Variant = a.getVariant();
        this.TestType = a.getTestType();

        this.JOIN_DATE = b.getJoinDate();
        this.HEALTH_CARD_ID = b.getHealthCareId();
        this.HEALTH_CARD_NAME = b.getHealthCareName();
    }

    public void setHEALTH_CARD_ID(int HEALTH_CARD_ID) {
        this.HEALTH_CARD_ID = HEALTH_CARD_ID;
    }

    public void setHEALTH_CARD_NAME(String HEALTH_CARD_NAME) {
        this.HEALTH_CARD_NAME = HEALTH_CARD_NAME;
    }

    public void setJOIN_DATE(LocalDate JOIN_DATE) {
        this.JOIN_DATE = JOIN_DATE;
    }

    public String getResultDate() {
        return ResultDate;
    }

    public String getLastName() {
        return LastName;
    }

    public int getIDNum() {
        return IDNum;
    }

    public String getFirstName() {
        return FirstName;
    }

    public int getIDType() {
        return IDType;
    }

    public int getResultTestCorona() {
        return ResultTestCorona;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public int getHEALTH_CARD_ID() {
        return HEALTH_CARD_ID;
    }

    public String getHEALTH_CARD_NAME() {
        return HEALTH_CARD_NAME;
    }

    public LocalDate getJOIN_DATE() {
        return JOIN_DATE;
    }

    public String getLabcode() {
        return Labcode;
    }

    public String getStickerNumber() {
        return StickerNumber;
    }

    public String getTestType() {
        return TestType;
    }

    public String getVariant() {
        return Variant;
    }

}
