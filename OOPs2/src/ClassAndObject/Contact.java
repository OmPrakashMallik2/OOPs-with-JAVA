package ClassAndObject;

public class Contact {
    private String email;
    private long phone;
    private long whatsapp;
    private String instagram;

    public Contact(String email, long phone, long whatsapp, String instagram) {
        this.email = email;
        this.phone = phone;
        this.whatsapp = whatsapp;
        this.instagram = instagram;
    }

    public void viesContacts() {
        System.out.println("Contact: [" +
                "Email='" + email + '\'' +
                ", Phone=" + phone +
                ", Whatsapp=" + whatsapp +
                ", Instagram='" + instagram + '\'' +
                "]");
    }
}
