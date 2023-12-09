class Tiger {
    void display() {
        System.out.println("i am tiger");
    }

    void display(boolean bol) {
        System.out.println("i am tiger");
    }

    void display(double dob) {
        System.out.println("i am tiger");
    }

    int display(int integer) {
        System.out.println("i am tiger");
        return integer;
    }

    // double display(int integer) {
    //     System.out.println("i am tiger");
    //     return (double) integer;
    // }
    // we cant change return type.
}

public class Methodoverloading {
    public static void main(String[] args) {
        System.out.println("Method Overloading.");
        Tiger t = new Tiger();
        t.display(10.5);
        t.display(10);
    }
}
