package Top10Exceptions;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        System.out.println("NumberFormatException Example");
        int i = Integer.parseInt("10");
        int i2 = Integer.parseInt("one");
    }
}
