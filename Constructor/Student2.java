public class Student2 {
    String n;
    String br;
    String sem;

    Student2(String name, String branch, String semester) {
        n = name;
        br = branch;
        sem = semester;
    }

    void display() {
        System.out.println(n + " from " + br + " from " + sem + " semester.");
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("OmPrakashMallik", "CSE", "8th");
        s1.display();
    }
}
