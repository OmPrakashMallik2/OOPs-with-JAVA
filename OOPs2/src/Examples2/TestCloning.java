package Examples2;

class Human implements Comparable{
    String name;
    int age;
    boolean gender; // male-true, female-false

    public Human(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //    @Override
    public void showHuman() {
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("gender: "+((gender) ? "Male" : "Female"));
        System.out.println(".................................");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class TestCloning {

    public static void main(String[] args) {
        Human human1 = new Human("Santosh Kumar Mallik", 43, true);
        Human human2 = new Human("Rita Devi", 38, false);
        Human human3 = new Human("Om Prakash Mallik", 23, true);
        Human human4 = new Human("Jay Prakash Mallik", 21, true);
        Human human5 = new Human("Sachin Kumar Mallik", 19, true);
        Human human6 = null;
        try {
            human6 = (Human) human3.clone();
            human3.name = "OPM2";
        } catch (CloneNotSupportedException ex) {
            ex.getMessage();
        }
        human1.showHuman();
        human2.showHuman();
        human3.showHuman();
        human4.showHuman();
        human5.showHuman();
        human6.showHuman();
    }
}

