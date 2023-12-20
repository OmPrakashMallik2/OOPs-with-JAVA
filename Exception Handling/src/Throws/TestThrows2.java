package Throws;

import java.io.IOException;

public class TestThrows2 {
    void Method() throws IOException {
        throw new IOException("System error");
    }

    public static void main(String[] args) {
        try {
            TestThrows2 tt = new TestThrows2();
            tt.Method();
        } catch (Exception e){
            System.out.println("Exception handled");
        }

        System.out.println("Normal flow");
    }
}
