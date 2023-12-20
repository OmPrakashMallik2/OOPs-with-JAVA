package Throw;

import java.io.*;

public class Throw2 {
    public static void main(String[] args) {
        try {
            mymethod();
        } catch (FileNotFoundException e){
//            e.printStackTrace();
            System.out.println("Exception found and handled");
        }

        System.out.println("Rest of the code");
    }

    public static void mymethod() throws FileNotFoundException {
        FileReader file = new FileReader("D:/random.txt");
        BufferedReader br = new BufferedReader(file);

        throw new FileNotFoundException();
    }
}
