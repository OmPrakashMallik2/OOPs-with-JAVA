// package Inheritance;

class A {
    void msg() {
        System.out.println("I am from A class");
    }
}

class B {
    void msg() {
        System.out.println("I am from B class");
    }
}

// class C extends A , B{
class C extends A {
    int temp = 10;
}

public class MultipleInheritX {
    public static void main(String[] args) {
        C obj = new C();
        obj.msg(); // code jhas no idea kaha se msg() le.
    }
}
