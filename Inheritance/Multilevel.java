// package Inheritance;

class Animal {
    void eat() {
        System.out.println("Enting..");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking..");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        BabyDog tommy = new BabyDog();
        tommy.eat();
        tommy.bark();
        tommy.weep();
    }
}