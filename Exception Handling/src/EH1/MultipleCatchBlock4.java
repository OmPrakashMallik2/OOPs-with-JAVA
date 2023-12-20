package EH1;

public class MultipleCatchBlock4 {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];
            arr[5] = 5;
        }

        catch (ArrayIndexOutOfBoundsException c){
            System.out.println("task2 is completed");
        }

        catch (ArithmeticException b){
            System.out.println("task1 is completed");
        }
        catch (Exception a){
            System.out.println("Common task completed");
        }
    }
}
