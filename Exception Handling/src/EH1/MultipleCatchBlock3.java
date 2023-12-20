package EH1;

public class MultipleCatchBlock3 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[8] = 10/0;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("ArrayIndexOutOfBoundsException exception occurs");
        }
        catch (ArithmeticException a){
            System.out.println("ArithmeticException exception occurs");
        }
        catch (Exception a){
            System.out.println("Other exception occurs");
        }
        System.out.println("Rest of the code");
    }
}
