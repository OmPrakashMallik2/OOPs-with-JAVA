package Throw;

public class Throw3 {
    public static void main(String[] args) {
        try{
            throw new UserDefinedException("This is user defined exception");
        } catch (UserDefinedException ude){
            System.out.println("Caught the exception");
            System.out.println(ude.getMessage());
        }

    }
}
