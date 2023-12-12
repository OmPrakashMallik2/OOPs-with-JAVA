class Student {
    int rollno;
    String n;
    static String college = "KEC";

    static void change() {
        college = "SIT";
    }

    Student(int roll, String name) {
        rollno = roll;
        n = name;
    }

    void display() {
        System.out.println(rollno + " " + n + " " + college);
    }
}

public class Student2 {
    public static void main(String[] args) {
        Student.change();

        System.out.println("static method example");
        Student s1 = new Student(19559, "Om Prakash Mallik");
        Student s2 = new Student(19545, "Mankit Kumar");


        s1.display();
        s2.display();
    }
}
