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

public class SingleInheritance {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.eat();
        tommy.bark();
    }
}
