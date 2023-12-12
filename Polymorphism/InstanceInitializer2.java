class Bike {
    Bike() {
        System.out.println("bike cons invoked");
    }

    {
        System.out.println("instance initializer invoked");
    }
}

public class InstanceInitializer2 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike();

    }
}
