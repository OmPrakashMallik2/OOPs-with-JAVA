package Top10Exceptions;

public class ExceptionInitializerErrorExample {
    static {
        String s = null;
        System.out.println(s.length());
        System.out.println("Static block execution");
    }
    public static void main(String[] args) {
        System.out.println("ExceptionInitializerError Example ");
    }
}
