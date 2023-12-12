// package this keyword;

class B {
    B() {
        this(20);
        System.out.println("B default");
    }

    B(int x) {
        System.out.println(x);
    }
}

public class ThisTest2 {
    public static void main(String[] args) {
        B b = new B();
    }
}
