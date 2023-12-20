package Throws;

import java.io.IOException;

public class TestThrows1 {

    void m() throws IOException {
        throw new IOException("System Error");
    }

    void n() throws IOException {
        m();
    }

    void p(){
        try{
            n();
        } catch (Exception e){
            System.out.println("Exception Handled");
        }
    }
    public static void main(String[] args) {
        TestThrows1 tt = new TestThrows1();
        tt.p();
        System.out.println("Normal Flow");
    }
}
