package Constructors;

public class Test2 {
    int a, b;
    public Test2 (int x, int y){
        a = x;
        b = y;
    }

    void m2(){
        m1();
    }

    static void m1(){
//        super.a = 10;
    }
    public Test2() {

    }

    static {
        System.out.println("this is static block");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
}
