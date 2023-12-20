package EH1;

public class FinallyBlock2 {
    public static void main(String[] args) {
        // case 2 : when exception occurs but handled by the catch block

        try{
            System.out.println("inside the try block");
            int temp = 10/0;
            System.out.println(temp);
        }
        // can not handle ArithmeticException
        // handle ArrayIndexOutOfBondException
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        finally {
            System.out.println("finally always executed.");
        }

        System.out.println("Rest of the code");
    }
}
