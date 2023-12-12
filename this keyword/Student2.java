// package this keyword;

class A {
    void m() {
        System.out.println("hello from m");
    }

    void n() {
        System.out.println("hello from n");
        m();
    }
}

public class Student2 {
    public static void main(String[] args) {
        new A().n();
    }
}
