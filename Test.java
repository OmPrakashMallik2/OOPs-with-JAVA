import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        Scanner op = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = op.nextInt();

        System.out.print("Enter Second Number : ");
        int b = op.nextInt();

        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for multiply");
        System.out.println("Press 4 for Divison");
        int input = op.nextInt();

        int sum;
        if (input == 1) {
            sum = myCalc.Add(a, b);
            System.out.println("Sum is : " + sum);
        } else if (input == 2) {
            sum = myCalc.Sub(a, b);
            System.out.println("Diff is : " + sum);
        } else if (input == 3) {
            sum = myCalc.Mul(a, b);
            System.out.println("Mul is : " + sum);
        } else if (input == 4) {
            sum = myCalc.Div(a, b);
            System.out.println("Div is : " + sum);
        }
    }
}