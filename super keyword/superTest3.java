class Life {
    Life() {
        System.out.println("Life Created.");
    }
}

class Animal extends Life {
    Animal() {
        System.out.println("Animal Created.");
    }
}

class Dynosour extends Animal {
    Dynosour() {
        super();
        System.out.println("Dynosour Created.");
    }
}

public class superTest3 {
    public static void main(String[] args) {
        Dynosour d = new Dynosour();
    }
}
