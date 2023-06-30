import java.util.Arrays;

// CREATED CLASS
class Students {
    String name;
    int roll ; 
    int age;
    float marks = 90;


    //constructor
    Students(String name, int roll, int age, float marks){
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.marks = marks;
    }
}

public class Main {
    
    public static void main(String[] args) {

        Students[] opm  =  new Students[5];

        System.out.println(Arrays.toString(opm));

        // object jpm
        Students jpm;
        jpm = new Students("Sachin", 5, 18, 78.5f);

        // giving value to jpm
        
                System.out.println(jpm.roll);
                System.out.println(jpm.name);
                System.out.println(jpm.marks);
                System.out.println(jpm.age);
        jpm.age = 21;
        jpm.roll = 42;
        jpm.name = "Jay Prakash Mallik";
        jpm.marks = 74.8f;

        // CONSTUCTOR : it is a special funtion that is inside a class,
        // if we dont make a constructor then object use the default constructor named 
        // by class name for example - class name is OPM then default constructor will be OPM() 
        
    }
}
