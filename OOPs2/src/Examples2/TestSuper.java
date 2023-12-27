package Examples2;

class Life {
    public Life (){
        System.out.println("Life is created.");
    }
}
class Animal extends Life {
    public Animal() {
        System.out.println("Animal is created.");
    }
}

class Lion extends Animal {
    public Lion() {
        System.out.println("Lion is created.");
    }
}


class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

}

class Employee extends Person {
    static int nextSerialNumber = 1;
    int serialNumber = nextSerialNumber;
    float salary;

    public Employee(String name, int age, String address, float salary){
        super(name, age, address);
        this.salary = salary;
        serialNumber = nextSerialNumber++;
    }
    public void display() {
        System.out.println("Employee : "+serialNumber);
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("address: "+address);
        System.out.println("salary: "+salary);
        System.out.println("...............................");
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Employee employee1 = new Employee("OPM", 23, "Darbhanga", 50000);
        Employee employee2 = new Employee("JPM", 21, "Samastipur", 60000);
        Employee employee3 = new Employee("SKM", 19, "Begusarai", 70000);
        employee1.display();
        employee2.display();
        employee3.display();
    }
}
