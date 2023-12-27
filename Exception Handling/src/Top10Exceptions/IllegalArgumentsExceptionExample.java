package Top10Exceptions;

import java.util.ArrayList;

public class IllegalArgumentsExceptionExample {
    public static void main(String[] args) {
        System.out.println("IllegalArgumentsException Example");

        Thread t1 = new Thread();
        t1.setPriority(10);
        t1.setPriority(100);
    }
}
