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


    //show
    void show(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("from : "+Address+".");
    }
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("OmPrakashMallik");
        s1.setAdd("Darbhanga");
        s1.setAge(22);

        s1.show();

        System.out.println(s1.getName());
    }
}
