// package this keyword;
class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student(19559, "om prakash mallik", 700f);
        Student s2 = new Student(19555, "Unknown sharma", 560f);
        s1.display();
        s2.display();
    }
}
