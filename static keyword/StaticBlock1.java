//
public class StaticBlock1 {
    static {
        System.out.println("static block is invoked.");
        System.out.println("static block is invoked 2.");
        System.out.println("static block is invoked 3.");
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
