
public class Test3 {
    public static void main(String[] args) {
        doStuff();
        System.out.println(30 / 0); // ArithmeticException
    }

    public static void doStuff() {
        doMoreStuff();
        System.out.println("do stuff");
    }

    public static void doMoreStuff() {
        System.out.println("do more stuff");
    }
}