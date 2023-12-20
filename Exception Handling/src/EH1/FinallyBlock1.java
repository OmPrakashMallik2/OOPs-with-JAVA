package EH1;

public class FinallyBlock1 {
    public static void main(String[] args) {
        // case 1 : when java exception is not occur
        try{
            int temp = 20/5;
            System.out.println(temp);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Handled");
        }

        finally {
            System.out.println("Finally always Executed.");
        }

        System.out.println("Rest of the code");
    }
}
