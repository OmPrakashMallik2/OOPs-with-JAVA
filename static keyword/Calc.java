class Calculator {
    static int cube(int x) {
        return x * x * x;
    }

    static int square(int x) {
        return x * x;
    }
}

public class Calc {
    public static void main(String[] args) {
        int result = Calculator.cube(5);
        System.out.println(result);
        int result2 = Calculator.square(5);
        System.out.println(result2);
    }
}
