class Animall {
    void eat() {
        System.out.println("Eating meats");
    }
}

class Dog extends Animall {
    void eat() {
        System.out.println("Eating food");
    }
}

class BabyDog extends Dog {
    // void eat() {
    //     System.out.println("Eating milk");
    // }
}

public class Animal {
    public static void main(String[] args) {
        Animall a, b, c;

        // a = new Animall();
        // a.eat();

        // b = new Dog();
        // b.eat();

        c = new BabyDog();
        c.eat();
    }
}
