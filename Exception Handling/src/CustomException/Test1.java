package CustomException;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String errorMassage){
        super(errorMassage);
    }
}
public class Test1 {

    static void checkAge(int a) throws InvalidAgeException {
        if(a < 18 ){
            throw new InvalidAgeException("Under age");
        } else {
            System.out.println("Welcome to vote!!");
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(13);
        } catch (InvalidAgeException ex){
            System.out.println("Exception occurred");
            System.out.println("Exception: "+ex);
        }

        System.out.println("Rest of the code in program");
    }
}
