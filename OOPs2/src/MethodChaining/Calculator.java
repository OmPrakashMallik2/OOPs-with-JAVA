package MethodChaining;

public class Calculator {
    private int result;

    public Calculator add(int a){
        result += result;
        return this;
    }

    public Calculator sub(int a){
        result -= a;
        return this;
    }

    public Calculator mul(int a){
        result *= a;
        return this;
    }

    public void getResult() {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(2).sub(2).mul(5).getResult();
    }
}
