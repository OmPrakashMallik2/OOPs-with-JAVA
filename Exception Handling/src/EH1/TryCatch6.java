package EH1;

public class TryCatch6 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            System.exit(0);
        } catch (Exception e){
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Rest of the code");
    }
}