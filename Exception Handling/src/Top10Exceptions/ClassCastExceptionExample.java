package Top10Exceptions;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        System.out.println("ClassCastException Example");
        String s1 = new String("Sample");
        Object o1 = (Object) s1;
        System.out.println(o1);

//        Object o2 = new Object();
//        String s2 = (Object) o2;
    }
}
