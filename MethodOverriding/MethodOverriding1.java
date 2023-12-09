
class Fruit {
    void seed() {
        System.out.println("Seed is the fruit.");
    }

    void Like() {
        System.out.println("Everyone likes frut.");
    }
}

class Mango extends Fruit {
    void Teste() {
        System.out.println("Mango is sweet.");
    }

    // this is method overriding
    void Like() {
        System.out.println("who doesn't like frut.");
    }
}

public class MethodOverriding1 {
    public static void main(String[] args) {
        System.out.println("Hello");

        Mango mango = new Mango();
        mango.Teste();
        mango.Like();
    }
}