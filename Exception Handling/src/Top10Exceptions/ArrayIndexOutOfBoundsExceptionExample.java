package Top10Exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        System.out.println("ArrayIndexOutOfBoundsException Example");
        int[] a = new int[10];
        // range is from 0 to 9
        System.out.println(a[0]);
        System.out.println(a[9]);
        try{
            System.out.println(a[100]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        System.out.println(a[5]);
    }
}
