public class Student {
    int rollNumber;
    String name;
    int semester;
    String branch;

    // method to display the name and roll onf student
    void display() {
        System.out.println(name + " " + branch + " " + semester);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
