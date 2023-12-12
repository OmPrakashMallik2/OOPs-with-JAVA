// package this keyword;

class A {
    A() {
        System.out.println("hello A");
    }

    A(int x) {
        this();
        System.out.println(x);
    }
}

public class TestThis {
    public static void main(String[] args) {
        A a = new A(10);
    }
}
