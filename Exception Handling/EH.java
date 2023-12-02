public class EH {
    public static void main(String[] args) {
        System.out.println("hello");
        // try catch

        int i = 10;
        int j = 0;
        int k = 0;

        try {
            k = i / j;
        } catch (ArithmeticException e) {
            System.out.println("10 cant be divided by 0");
            System.out.println();
        }

    }
}