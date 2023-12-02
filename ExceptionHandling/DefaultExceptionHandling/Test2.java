
public class Test2 {
    public static void main(String[] args) {
        doStuff();
    }

    public static void doStuff() {
        doMoreStuff();
        System.out.println(20 / 0); // ArithmeticException
    }

    public static void doMoreStuff() {
        System.out.println("hello");
    }
}
