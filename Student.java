class Father {
    String FatherName;
    int FatherAge;

    //setter
    public void job(String job){
        System.out.println("i am "+job);
    }

}

public class Student extends Father {
    String name;
    int age;
    String Address;


    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setAdd(String Address){
        this.Address = Address;
    }
    public void setAge(int age){
        this.age = age;
    }


    //getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAdd(){
        return Address;
    }


    //show
    public void show(){
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

        s1.job("Engineer");
    }
}
