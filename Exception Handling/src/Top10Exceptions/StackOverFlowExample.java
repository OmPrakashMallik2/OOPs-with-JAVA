package Top10Exceptions;

public class StackOverFlowExample {
    public static void m1(){
        System.out.println("m1");
        m2();
    }
    public static void m2(){
        System.out.println("m2");
        m1();
    }

    public static void main(String[] args) {
        m1();
    }
}
