class Student {
    int rollno;
    String naam;
    static String college = "KEC";

    Student(int roll, String name) {
        rollno = roll;
        naam = name;
    }

    void display() {
        System.out.println(rollno + " " + naam + " " + college);
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student(19559, "Om Prakash Mallik");
        Student s2 = new Student(19552, "Amrit Kumar");
        // s2.college = "SIT";
        // we can change the college of all object just by single line of code.

        s1.display();
        s2.display();
    }
}
