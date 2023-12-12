// package this keyword;

class Student {

    int rollno;
    String name, course;
    float fee;

    Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    Student(int rollno, String name, String course, float fee) {
        this(rollno, name, course); // this must be first line of code.
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }

}

public class Student3 {
    public static void main(String[] args) {
        Student s1 = new Student(111, "opm", "cse");
        Student s2 = new Student(222, "aman", "me", 3200f);

        s1.display();
        s2.display();
    }
}
