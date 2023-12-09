
public class OverloadingTypePromotion3 {

    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String args[]) {
        OverloadingTypePromotion3 obj = new OverloadingTypePromotion3();
        // obj.sum(20, 20); // Ambiguity - no matching type, and each method promotes a similar number of
        // arguments
    }
}
