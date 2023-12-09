class Calculation {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(long a, long b) {
        System.out.println(a + b);
    }
}

public class OverloadingTypePromotion2 {
    public static void main(String[] args) {
        System.out.println("Overloading TypePromotion 2");
        Calculation calc = new Calculation();
        calc.sum(10, 'a');
        // calc.sum(10.5, 10.5);
    }
}
