package TheConstantsSampler.MadaSampels;

public class ReportData {
    private String MDACODE;
    private String IDNum;
    private String IDType;
    private String FirstName;
    private String LastName;
    private String City;
    private String Street;
    private String BuildingNumber;
    private String Barcode;
    private String GetDate;
    private String TakeDate;
    private String ResultDate;

    public ReportData(String MDACODE, String IDNum, String IDType, String FirstName, String LastName, String City, String Street, String BuildingNumber, String Barcode, String GetDate, String TakeDate, String ResultDate){
        this.MDACODE = MDACODE;
        this.IDNum = IDNum;
        this.IDType = IDType;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.City = City;
        this.Street = Street;
        this.BuildingNumber = BuildingNumber;
        this.Barcode = Barcode;
        this.GetDate = GetDate;
        this.TakeDate = TakeDate;
        this.ResultDate = ResultDate;
    }

    public String getBarcode() {
        return Barcode;
    }

    public String getBuildingNumber() {
        return BuildingNumber;
    }

    public String getCity() {
        return City;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getGetDate() {
        return GetDate;
    }

    public String getIDNum() {
        return IDNum;
    }

    public String getIDType() {
        return IDType;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMDACODE() {
        return MDACODE;
    }

    public String getResultDate() {
        return ResultDate;
    }

    public String getStreet() {
        return Street;
    }

    public String getTakeDate() {
        return TakeDate;
    }
}
