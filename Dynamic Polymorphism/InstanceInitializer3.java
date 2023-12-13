
class A {
    A() {
        System.out.println("A class");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("B class");
    }

    {
        System.out.println("instance initializer");
    }
}

public class InstanceInitializer3 {
    public static void main(String[] args) {
        B b = new B();
    }
}
