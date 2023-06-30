import Inheritance.*;

public class Demo {
    public static void main(String[] args) {
        Calculator myobj = new Calculator();
        myobj.Add(10, 20);
        myobj.Sub(10, 20);
        myobj.Div(20,20);
        myobj.Mul(20,10);

        Me myself = new Me();
        System.out.println(myself.name);
        System.out.println(myself.surname);
        System.out.println(myself.getJameen());

    }
}
