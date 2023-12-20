package EH1;

public class TryCatch1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;

        try{
            System.out.println(a/b);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("execution is done");
        }
    }
}
