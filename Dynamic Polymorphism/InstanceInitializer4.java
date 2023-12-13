
class A {
    A() {
        System.out.println("A class instance");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("B class instance");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("C class instance");
    }

    {
        System.out.println("instance initialzer");
    }
}

public class InstanceInitializer4 {
    public static void main(String[] args) {
        C c = new C();
    }
}
