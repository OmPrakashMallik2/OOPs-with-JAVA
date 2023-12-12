class Animal {
    Animal() {
        System.out.println("Animal Created");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog Created");
    }
}

public class superTest4 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
