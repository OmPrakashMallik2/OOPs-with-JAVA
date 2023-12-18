package Examples2;
import Examples.A;

public class C extends A {
    public static void main(String[] args) {
        A obj = new A();
//        obj.msg();

        C obj2 = new C();
        obj2.msg();

        A obj3 = new C();
//        obj3.msg();
    }
}
