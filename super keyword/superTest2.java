class Pet {
    void eat() {
        System.out.println("Pet Eating...");
    }
}

class Animal extends Pet {
    String name;

    void eat() {
        System.out.println("Animal Eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog Eating...");
    }

    void bark() {
        System.out.println("Dog Barking...");
    }

    void work() {
        super.eat();
    }
}

public class superTest2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}
