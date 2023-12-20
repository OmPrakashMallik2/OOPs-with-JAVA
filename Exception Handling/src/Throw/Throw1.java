package Throw;

import java.util.Scanner;

public class Throw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Person age of voter : ");
        int num = sc.nextInt();
        validate(num);
        System.out.println("rest of the code");
    }

    public static void validate(int num){
        if(num < 18){
            throw new ArithmeticException("Person is under age");
        } else {
            System.out.println("Person is eligible to vote");
        }
    }
}
