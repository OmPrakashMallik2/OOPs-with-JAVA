// package Inheritance;

class A {
    int a = 10;
}

class B extends A {
    int b = 20;
}

class C extends B {
    int c = 30;
}

public class Test extends C {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
    }
}
