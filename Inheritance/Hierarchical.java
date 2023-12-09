// package Inheritance;

class Bird {
    void fly() {
        System.out.println("Flying...");
    }
}

class Parrot extends Bird {
    void talk() {
        System.out.println("Talking...");
    }
}

class Crow extends Bird {
    void black() {
        System.out.println("black in color.");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Parrot mithu = new Parrot();
        mithu.fly();
        mithu.talk();
        // mithu.black(); it will throw error.
    }
}
