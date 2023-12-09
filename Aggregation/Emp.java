// package Aggregation;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("gzb", "UP", "India");
        Address address2 = new Address("Dbg", "Bihar", "India");

        Emp e = new Emp(111, "OPM", address1);
        Emp e2 = new Emp(222, "JPM", address2);

        e.display();
        e2.display();
    }
}
