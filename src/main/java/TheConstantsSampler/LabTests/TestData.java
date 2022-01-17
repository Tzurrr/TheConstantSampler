package TheConstantsSampler.LabTests;

public class TestData {
    private String IDNum;
    private int IDType;
    private String FirstName;
    private String LastName;
    private String ResultDate;
    private String BirthDate;
    private String Labcode;
    private String StickerNumber;
    private int ResultTestCorona;
    private String Variant;
    private String TestType;

    private String JOIN_DATE;
    private String HEALTH_CARD_ID;
    private String HEALTH_CARD_NAME;

    public TestData(String IDNum, int IDType, String FirstName, String LastName, String ResultDate, String BirthDate, String Labcode, String StickerNumber, int ResultTestCorona, String Variant, String TestType){
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

    public TestData(String IDNum, int IDType, String FirstName, String LastName, String ResultDate, String BirthDate, String Labcode, String StickerNumber, int ResultTestCorona, String Variant, String TestType, String JOIN_DATE, String HEALTH_CARD_ID, String HEALTH_CARD_NAME){
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

    public void setHEALTH_CARD_ID(String HEALTH_CARD_ID) {
        this.HEALTH_CARD_ID = HEALTH_CARD_ID;
    }

    public void setHEALTH_CARD_NAME(String HEALTH_CARD_NAME) {
        this.HEALTH_CARD_NAME = HEALTH_CARD_NAME;
    }

    public void setJOIN_DATE(String JOIN_DATE) {
        this.JOIN_DATE = JOIN_DATE;
    }
}
