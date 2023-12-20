package Throws;

import java.io.IOException;

public class TestThrows4 {
    void method() throws IOException {
        throw new IOException("Device error");
    }

    public static void main(String[] args) throws IOException {
        TestThrows4 tt = new TestThrows4();
        tt.method();

        System.out.println("Normal flow");
    }
}
