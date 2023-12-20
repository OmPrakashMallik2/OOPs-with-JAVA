package Throws;

import java.io.IOException;

public class TestThrows3 {
    void method() throws IOException {
        System.out.println("Device operation performed");
    }

    public static void main(String[] args) throws IOException {
        TestThrows3 tt = new TestThrows3();
        tt.method();

        System.out.println("Normal flow");
    }
}
