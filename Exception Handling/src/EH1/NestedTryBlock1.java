package EH1;

public class NestedTryBlock1 {
    public static void main(String[] args) {
        // outer try block
        try{

            // inner try block 1
            try{
                System.out.println("Going to divide by zero.");
                int x = 10/0;
            }
            // catch for inner block 1
            catch (ArithmeticException e1){
                System.out.println(e1);
            }

            System.out.println("other statements");

            // inner try block 2
            try{
                int arr[] = new int[5];
                arr[5] = 4; // assigned the array out of bound.
            }

            // catch for inner block 2
            catch (ArrayIndexOutOfBoundsException e2){
                System.out.println(e2);
            }

            System.out.println("other statements");
        }
        // catch for outer block
        catch (Exception e3){
            System.out.println("Handled by outer catch.");
        }

        System.out.println("Normal flow of program.");
    }
}
