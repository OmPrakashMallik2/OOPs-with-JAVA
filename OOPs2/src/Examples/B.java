package Examples;

public class B extends  A{
    @Override
    protected void msg(){
        System.out.println("from class B");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();

        B obj2 = new B();
        obj2.msg();

        A obj3 = new B();
        obj3.msg();
    }
}
