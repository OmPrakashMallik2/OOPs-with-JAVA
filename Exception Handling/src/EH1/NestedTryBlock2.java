package EH1;

public class NestedTryBlock2 {
    public static void main(String[] args) {
        // outer try block
        try {

            // inner try block 1
            try{

                // inner try block 2
                try{
                    int arr[] = {1,2,3,4,5};
                    System.out.println(arr[10]);
                }
                // catch for inner try block 2
                catch (ArithmeticException e1){
                    System.out.println("ArithmeticException occurs");
                    System.out.println("inner try block 2");
                }
            }

            // to handle AE from block 1
            catch (ArithmeticException e2){
                System.out.println("ArithmeticException occurs");
                System.out.println("inner try block 1");
            }
        }
        // outer catch
        catch (ArrayIndexOutOfBoundsException e3){
            System.out.println("ArrayIndexOutOfBoundsException occurs");
            System.out.println("handle by outer try block");
        }
        //
        catch (Exception e4){
            System.out.println("other Exception occurs");
            System.out.println("handle by outer Parent block");
        }
    }
}
