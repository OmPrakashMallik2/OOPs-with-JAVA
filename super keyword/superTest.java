class Pet {
    String color = "Brown";
}

class Animal extends Pet {
    // String color = super.color;
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
        // System.out.println(this.color);
    }
}

public class superTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
