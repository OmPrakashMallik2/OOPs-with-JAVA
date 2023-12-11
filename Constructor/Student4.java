
public class Student4 {
    String n;
    int a;

    Student4(String name, int Age) {
        n = name;
        a = Age;
    }

    Student4(Student4 s) {
        n = s.n;
        a = s.a;
    }

    void display() {
        System.out.println(n + " " + a);
    }

    public static void main(String[] args) {
        Student4 s1 = new Student4("OmPrakashMallik", 23);
        Student4 s2 = new Student4(s1);

        s1.display();
        s2.display();
    }
}