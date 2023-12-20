package EH1;

public class MultipleCatchBlock2 {
    public static void main(String[] args) {
        try{
            int arr[] = new int[10];
            System.out.println(arr[15]);
//            arr[4] = 4/0;
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

        System.out.println("Rest of the program");
    }
}
