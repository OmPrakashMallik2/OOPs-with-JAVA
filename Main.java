import java.util.Arrays;

// CREATED CLASS
class Students {
    String name;
    int roll ; 
    int age;

    // cant modify the variable of final.
    // final float marks = 90;
    float marks = 90;

    void Hello(){
        System.out.println("my name is "+this.name);
    }

    void ChangeName(String name){
        this.name = name;
    }


    //constructor
    Students(String name, int roll, int age, float marks){
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.marks = marks;
    }

    // Students(){
    //     this.name = "skm";
    //     this.roll = 05;
    //     this.age = 18;
    //     this.marks = 78;
    // }

    Students(Students random){
        this.name = random.name;
        this.roll = random.roll;
        this.age = random.age;
        this.marks = random.marks;
    }

    //Call constructor from another constructor
    Students() {
        // using this keyword
        this("papa", 32,43,98);
    }
}

public class Main {
    
    public static void main(String[] args) {

        // array of objects of a class
        Students[] opm  =  new Students[5];

        // acess object from array of object
        opm[0] = new Students();
        System.out.println(opm[0].name);

        System.out.println(Arrays.toString(opm));

        // object jpm
        Students jpm;
        jpm = new Students();
        
        
        // giving value to jpm
        jpm.age = 21;
        jpm.roll = 42;
        jpm.name = "Jay Prakash Mallik";
        jpm.marks = 74.8f;
        jpm.Hello();
        
        // System.out.println(jpm.roll);
        // System.out.println(jpm.name);
        // System.out.println(jpm.marks);
        // System.out.println(jpm.age);
        // jpm.Hello();
        
        // jpm.ChangeName("opm");
        // jpm.Hello();
        
        Students st1 = new Students("opm",23,34,78);
        System.out.println(st1.name);

        Students other = new Students();
        System.out.println(other.name);

        System.out.println(other.marks);


        // CONSTUCTOR : it is a special funtion that is inside a class,
        // if we dont make a constructor then object use the default constructor named 
        // by class name for example - class name is OPM then default constructor will be OPM() 
        
    }
}