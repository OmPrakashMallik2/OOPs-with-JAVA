package EH1;

import java.io.FileNotFoundException;

public class MultipleCatchBlock1 {
    public static void main(String[] args) {
        try {
            String str  = null;
            System.out.println(str.length());
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("ArrayIndexOutOfBoundsException exception occurs");
        }
        catch (ArithmeticException a){
            System.out.println("ArithmeticException exception occurs");
        }
        catch (Exception a){
            System.out.println("Parent exception occurs");
        }

        System.out.println("Rest of the code");
    }
}