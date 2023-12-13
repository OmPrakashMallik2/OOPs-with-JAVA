class Bike {
    int cc;
    String name;
    final int milage;

    Bike(int cc, String name, int milage) {
        // speedlimit = 120; // cant chnage final variable
        this.cc = cc;
        this.name = name;
        this.milage = milage;
        System.out.println("Bike created");
    }

    final void display() {
        System.out.println(cc + " " + name + " " + milage);
    }
}

public class FinalTest {
    public static void main(String[] args) {
        Bike b = new Bike(100, "Passion+", 65);
        b.display();
    }
}
/