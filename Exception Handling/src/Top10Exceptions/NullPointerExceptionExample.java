package Top10Exceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        System.out.println("NullPointerException Example");
        String s1 = "String";
        System.out.println(s1.length());


        String s2 = null;
        try{
            System.out.println(s2.length());
        } catch (NullPointerException npe){
            System.out.println(npe);
        }

        String s3 = "StringAgain";
        System.out.println(s3.length());

    }
}
