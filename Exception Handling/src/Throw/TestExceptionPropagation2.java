package Throw;


import java.io.IOException;

public class TestExceptionPropagation2 {
    void m() {
//        throw new java.io.IOException("Device Error");
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
        TestExceptionPropagation1 tp2 = new TestExceptionPropagation1();
        tp2.p();
        System.out.println("Normal flow of program");
    }
}
