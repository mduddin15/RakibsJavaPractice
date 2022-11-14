package OOP.Composition;

public class Address {
    private int houseNo;
    private int roadNo;
    private String block;
    private String area;
    private String Thana;
    private int postcode;

    public Address(int houseNo, int roadNo, String block, String area, String thana, int postcode) {
        this.houseNo = houseNo;
        this.roadNo = roadNo;
        this.block = block;
        this.area = area;
        Thana = thana;
        this.postcode = postcode;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public int getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(int roadNo) {
        this.roadNo = roadNo;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getThana() {
        return Thana;
    }

    public void setThana(String thana) {
        Thana = thana;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", roadNo=" + roadNo +
                ", block='" + block + '\'' +
                ", area='" + area + '\'' +
                ", Thana='" + Thana + '\'' +
                ", postcode=" + postcode +
                '}';
    }
}
