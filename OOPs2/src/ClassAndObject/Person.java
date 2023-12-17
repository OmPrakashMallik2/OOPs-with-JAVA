package ClassAndObject;

public class Person {
    private String name;
    private String fatherName;
    private String gender;
    private String DOB;
    private Education educations;
    private Address address;
    private Contact contacts;

    public Person(String name, String fatherName, String gender, String DOB, Education educations, Address address, Contact contacts) {
        this.name = name;
        this.fatherName = fatherName;
        this.gender = gender;
        this.DOB = DOB;
        this.educations = educations;
        this.address = address;
        this.contacts = contacts;
    }

    public void personDetails() {
        System.out.println( "Person Details: [" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", gender='" + gender + '\'' +
                ", DOB='" + DOB + '\'' +
                "]");

        educations.educationDetails();
        address.viewAddress();
        contacts.viesContacts();
    }
}
