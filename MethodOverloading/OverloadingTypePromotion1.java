class Calculation {
    void add(int a, float b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class OverloadingTypePromotion1 {
    public static void main(String[] args) {
        System.out.println("Overloading Type Changing example 1");
        Calculation cal = new Calculation();
        cal.add(20, 10); // b promoted to flaot in this case
        cal.add(10, 10, 20);
    }
}