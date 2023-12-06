package Inheritance;
public class Calculator extends AdvCalc {
    public void Add(int a, int b){
        int sum = a + b;
        System.out.println("Sum is : "+sum);
    }
    public void Sub(int a, int b){
        int sub = a - b;
        System.out.println("Sub is : "+sub);
    }
}

class AdvCalc{
    public void Mul(int a, int b){
        System.out.println("Multiply is : "+(a*b));
    }
    public void Div(int a, int b){
        System.out.println("Divison is : "+ (a/b));
    }
}