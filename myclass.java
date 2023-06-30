public class myclass {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "OP";
        p1.age =22;
        p1.walk();
        System.out.println(p1.name+" is "+p1.age+" now.");
        
        Person p2 = new Person(18,"queen");
        // p2.name = "Queen";
        // p2.age =18;
        p2.smile();
        p2.walk(5);
        System.out.println(p2.name+" is "+p2.age+" now.");

        System.out.println(Person.count);
    }
}

class Person{
    String name;
    int age;

    static int count;

    public Person(){
        count++;
        System.out.println("creating an object.");
    }

    public Person(int age, String name){
        this();
        this.name = name;
        this.age = age;
    }

    void walk(){
        System.out.println(name+" is walking");
    }
    void smile(){
        System.out.println(name+" is smiling");
    }

    void walk(int steps){
        System.out.println(name+" walked "+steps+" steps");
    }
}