package Throw;

public class Throw4 extends RuntimeException{
    public static void main(String[] args) {
//        System.out.println(10/0);
//        throw new ArithmeticException("/ by zero");
//        System.out.println("Hello");// this become unreachable now.

        throw new Throw4(); // incompatible type.
    }
}
