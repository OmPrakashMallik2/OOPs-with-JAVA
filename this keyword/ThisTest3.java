class S2 {
    void m(S2 obj) {
        System.out.println("method invoked.");
    }

    void p() {
        m(this);
    }
}

public class ThisTest3 {
    public static void main(String[] args) {
        S2 s2 = new S2();
        s2.p();
    }
}