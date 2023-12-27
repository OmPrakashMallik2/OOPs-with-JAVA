package Examples2;

import java.util.ArrayList;

class Student {
    int rollNumber;
    String name;
    int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public void showStudent() {
        System.out.println("Student [" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ']');
    }
}

class University {
    ArrayList<Student> studentList;

    University(){
        studentList = new ArrayList<>();
    }

    void addStudent(Student student){
        studentList.add(student);
    }

    void getStudents(){
        for(Student st : studentList){
            st.showStudent();
        }
    }
}
public class Aggregation1  {
    public static void main(String[] args) {
        Student s1 = new Student(101, "OPM", 23);
        Student s2 = new Student(102, "JPM", 21);
        Student s3 = new Student(103, "SKM", 19);

        University university = new University();
        university.addStudent(s1);
        university.addStudent(s2);
        university.addStudent(s3);
        university.getStudents();
    }
}
