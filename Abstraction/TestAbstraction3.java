
abstract class Animal {
    Animal() {
        System.out.println("Animal is created");
    }

    abstract void eat();

    void run() {
        System.out.println("Animal can run properly");
    }
}

class Dog extends Animal {

    void eat() {
        System.out.println("Dog can eat");
    }
}

public class TestAbstraction3 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.run();
    }
}
