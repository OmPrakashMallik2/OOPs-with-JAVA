
public class Student3 {
    int r;
    String n;
    int a;

    Student3(int roll_number, String name) {
        r = roll_number;
        n = name;
    }

    Student3(int roll_number, String name, int Age) {
        r = roll_number;
        n = name;
        a = Age;
    }

    void display() {
        System.out.println(r + " " + n + " " + a);
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3(1, "OmPrakashMallik", 23);
        Student3 s2 = new Student3(2, "Unknown");
        // Student3 s2 = new Student3(3,23);

        s1.display();
        s2.display();
    }
}
