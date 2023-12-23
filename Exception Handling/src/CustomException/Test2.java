package CustomException;

class MyCustomException extends Exception {
    // code

    public MyCustomException(String str) {
        super(str);
    }
}
public class Test2 {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("custom massage");
        } catch (MyCustomException ex){
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
        System.out.println("rest of the code...");
    }
}
