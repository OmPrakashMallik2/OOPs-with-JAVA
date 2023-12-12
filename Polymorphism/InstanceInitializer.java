class Bike {
    int speed;

    Bike() {
        System.out.println("Speed is : " + speed);
    }

    {
        speed = 100;
    }
}

public class InstanceInitializer {
    public static void main(String[] args) {
        System.out.println("instance initializer");
        Bike b1 = new Bike();
        Bike b2 = new Bike();
    }
}
