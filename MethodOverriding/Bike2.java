class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
}

public class Bike2 extends Vehicle {

    void run() {
        System.out.println("Bike2 is running safely...");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();
        obj.run();
    }
}
