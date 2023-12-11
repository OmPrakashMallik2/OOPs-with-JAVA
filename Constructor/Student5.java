
public class Student5 {
    String n;
    int a;

    Student5(String name, int Age) {
        n = name;
        a = Age;
    }

    Student5() {
    }

    void display() {
        System.out.println(n + " " + a);
    }

    public static void main(String[] args) {
        Student5 s1 = new Student5("OmPrakashMallik", 23);
        Student5 s2 = new Student5();

        s2.n = s1.n;
        s2.a = s1.a;

        s1.display();
        s2.display();
    }
}