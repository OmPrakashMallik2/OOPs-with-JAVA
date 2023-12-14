
class Animal {
}

class Dog extends Animal {
    Dog() {
        System.out.println("dog is created");
    }
}

public class Simple {
    public static void main(String[] args) {

        Simple s = new Simple();

        Dog d = new Dog();
        Dog d2 = null;
        System.out.println(d2 instanceof Animal);
    }
}
