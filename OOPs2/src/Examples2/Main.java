package Examples2;

interface A {
    int myAge = 23;
    static void z(){
        System.out.println("static A");
    }
    void a();
    void b();
    void c();
    void d();
}

public class Main implements A {
    public void a(){
        System.out.println("i am A");
    }
    public void b(){
        System.out.println("i am B");
    }
    public void d(){
        System.out.println("i am D");
    }
    public void c(){
        System.out.println("i am C");
    }
    public static void main(String[] args) {
        A obj = new Main();
        A.z();
        obj.b();
        obj.c();
        obj.d();
        System.out.println(obj.myAge);
    }
}
