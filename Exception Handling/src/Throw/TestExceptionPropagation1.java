package Throw;

public class TestExceptionPropagation1 {
    void m(){
        int x = 20/0;
    }
    void n(){
        m();
    }

    void p(){
        try{
            n();
        } catch (Exception e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        TestExceptionPropagation1 tp1 = new TestExceptionPropagation1();
        tp1.p();
        System.out.println("Normal flow of program");
    }
}
