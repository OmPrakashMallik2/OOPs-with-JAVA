import java.util.Arrays;

// CREATED CLASS
class Students {
    String name;
    int roll ; 
    int age;
    float marks = 90;

    void Hello(){
        System.out.println("my name is "+this.name);
    }

    void ChangeName(String naaam){
        this.name = naaam;
    }


    //constructor
    // Students(String name, int roll, int age, float marks){
    Students(){
        this.name = "skm";
        this.roll = 05;
        this.age = 18;
        this.marks = 78;
    }
}

public class Main {
    
    public static void main(String[] args) {

        Students[] opm  =  new Students[5];

        System.out.println(Arrays.toString(opm));

        // object jpm
        Students jpm;
        jpm = new Students();
        jpm.Hello();
        
        // giving value to jpm
        jpm.age = 21;
        jpm.roll = 42;
        jpm.name = "Jay Prakash Mallik";
        jpm.marks = 74.8f;
        
        System.out.println(jpm.roll);
        System.out.println(jpm.name);
        System.out.println(jpm.marks);
        System.out.println(jpm.age);
        jpm.Hello();

        jpm.ChangeName("opm");
        jpm.Hello();

        // CONSTUCTOR : it is a special funtion that is inside a class,
        // if we dont make a constructor then object use the default constructor named 
        // by class name for example - class name is OPM then default constructor will be OPM() 
        
    }
}
