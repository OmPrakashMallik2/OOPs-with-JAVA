
// final class Bike { // final class cant be extende from a class.

class Bike {
    Bike() {
        System.out.println("Bike created");
    }
}

class Honda extends Bike {
    Honda() {
        System.out.println("Honda created");
    }
}

public class FinalTest3 {
    public static void main(String[] args) {
        Honda h = new Honda();
    }
}
