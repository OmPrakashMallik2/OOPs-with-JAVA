import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {

        Students[] opm  =  new Students[5];

        System.out.println(Arrays.toString(opm));

        // object jpm
        Students jpm;
        jpm = new Students();

        // giving value to it
        jpm.age = 21;
        jpm.roll = 42;
        jpm.name = "Jay Prakash Mallik";
        jpm.marks = 74.8f;

        System.out.println(jpm.roll);
        System.out.println(jpm.name);
        System.out.println(jpm.marks);
        System.out.println(jpm.age);
        
    }
}


// CREATED CLASS
class Students {
    int age;

    // store 5 roll numbers
    int roll ; 

    // store 5 names
    String name;
    
    // marks
    float marks = 90;
}