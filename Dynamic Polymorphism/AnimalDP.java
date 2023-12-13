
class Animal {
    void eat() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat");
    }
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion");
    }
}

class Fox extends Animal {
    void eat() {
        System.out.println("Fox");
    }
}

public class AnimalDP {
    public static void main(String[] args) {
        System.out.println("Animal example");

        Animal s;

        s = new Animal();
        s.eat();
        s = new Dog();
        s.eat();
        s = new Cat();
        s.eat();
        s = new Lion();
        s.eat();
        s = new Fox();
        s.eat();
    }
}
