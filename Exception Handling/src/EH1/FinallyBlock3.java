package EH1;

public class FinallyBlock3 {
    public static void main(String[] args) {
        // case 2 : when exception occurs and handled by the catch block

        try{
            System.out.println("inside the try block");
            int temp = 10/0;
            System.out.println(temp);
        }
        catch (ArithmeticException a){
            System.out.println("Exception handled by catch block");
        }

        finally {
            System.out.println("finally always executed.");
        }

        System.out.println("Rest of the code");
    }
}
