class Bike {
    int maxspeed = 90;
}

class Honda extends Bike {
    int maxspeed = 120;
}

public class BikeDP {
    public static void main(String[] args) {

        Bike b;

        b = new Bike();
        System.out.println(b.maxspeed);

        b = new Honda();
        System.out.println(b.maxspeed);
    }
}
