public class Student {
    String name;
    int age;
    String Address;

    //setter
    void setName(String name){
        this.name = name;
    }
    void setAdd(String Address){
        this.Address = Address;
    }
    void setAge(int age){
        this.age = age;
    }

    //getter
    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    String getAdd(){
        return Address;
    }


    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
