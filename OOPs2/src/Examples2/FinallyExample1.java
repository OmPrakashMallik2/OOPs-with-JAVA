package Examples2;

public class FinallyExample1 {
    public static void main(String[] args) throws Exception {
        method(-9);
    }

    public static void method(int x) throws Exception {
        if(x < 0){
            throw new Exception("x cant be negative");
        }
    }
}
