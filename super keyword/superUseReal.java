class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Boy extends Person {
    boolean boy;

    Boy(int id, String name, boolean boy) {
        super(id, name);
        this.boy = boy;
    }

    void display() {
        System.out.println(id + " " + name + " " + boy);
    }
}

public class superUseReal {
    public static void main(String[] args) {
        System.out.println("super real example");
        Boy obj = new Boy(1, "OPM", false);
        obj.display();
    }
}
