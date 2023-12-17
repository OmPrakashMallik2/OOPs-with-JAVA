package ClassAndObject;

public class Address {
    private String village;
    private String post;
    private String policeStation;
    private String district;
    private long pinCode;
    final private String state = "Bihar";

    public Address(String village, String post, String policeStation, String district, long pinCode) {
        this.village = village;
        this.post = post;
        this.policeStation = policeStation;
        this.district = district;
        this.pinCode = pinCode;
    }

    public void viewAddress() {
        System.out.println("Address: [" +
                "village='" + village + '\'' +
                ", post='" + post + '\'' +
                ", policeStation='" + policeStation + '\'' +
                ", district='" + district + '\'' +
                ", pinCode=" + pinCode +
                ", state='" + state + '\'' +
                "]");
    }
}
