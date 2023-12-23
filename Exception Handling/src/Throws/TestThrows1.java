package Throws;

import java.io.IOException;

public class TestThrows1 {
    void m1() throws IOException {
        throw new IOException("Device error");
    }

    void m2() throws IOException {
        m1();
    }

    void m3(){
        try{
            m2();
        } catch (Exception e){
            System.out.println("Exception handled");
        }
    }
    public static void main(String[] args) {
        TestThrows1 tt = new TestThrows1();
        tt.m3();
        System.out.println("Normal Flow");
    }
}
