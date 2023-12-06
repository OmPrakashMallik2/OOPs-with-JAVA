class Human {
    int age = 22;
    String name;
    int salary;
    boolean married;
    static long population;


    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;

    }
}
public class DeepDive {
    public static void main(String[] args) {
        Human obj = new Human(23, "opm", 30000, false);
        Human obj2 = new Human(21, "jpm", 0, false);
        Human obj3 = new Human(18, "skm", 0, false);

        System.out.println(obj.population);
        System.out.println(obj2.population);
        System.out.println(obj3.population);


    }


    static void show(){
        // calling a non static method
        fun(); // it giving error
        //to fix this error
        Main obj = new Main();
        obj.fun();
        System.out.println("hey");
    }
    
    void fun(){
        // calling a static method
        show(); //it does not going error
        System.out.println("hello");
    }
}
