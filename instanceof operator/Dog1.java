class Animal {
}

class Dog extends Animal {
    static void method1(Animal a) {
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            System.out.println("Ok, Downcasting is performed");
        }
    }
}

public class Dog1 {
    public static void main(String[] args) {
        Dog a = new Dog();
        Dog.method1(a);
    }
}