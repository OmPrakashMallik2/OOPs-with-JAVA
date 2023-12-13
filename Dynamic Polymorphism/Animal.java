class Animall {
    void eat() {
        System.out.println("Eating meats");
    }

    void bark() {
        System.out.println("Animal aint Barking...");
    }
}

class Dog extends Animall {
    void eat() {
        System.out.println("Eating food");
    }

}

class BabyDog extends Dog {
    // void eat() {
    // System.out.println("Eating milk");
    // }
}

public class Animal {
    public static void main(String[] args) {
        Animall a, b, c;

        // a = new Animall();
        // a.eat();

        b = new Dog();
        b.eat();
        b.bark();

        // c = new BabyDog();
        // c.eat();
    }
}
