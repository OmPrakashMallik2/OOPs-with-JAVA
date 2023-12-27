package Constructors;

public class Test1 {
    public Test1(int a, int b){
        System.out.println("a: "+a+", b: "+b);
    }
    public Test1(int a, float b){
        System.out.println("a: "+a+", b: "+b);
    }

    public static void main(String[] args) {
        byte a = 10;
        byte b = 15;
        Test1 t1 = new Test1(a,b);
    }
}
