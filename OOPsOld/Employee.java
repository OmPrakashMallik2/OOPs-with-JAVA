class Employee {
    private int empID = 2;
    private int ph = 735228;
    private String name;
    private int basicsalary = 15000;
    private int insentive = 1600;

    Employee(String Naam, int mobileNumber){
        name = Naam;
        ph = mobileNumber;
    }

    Employee(){
        name ="rohit";
        ph = 23456;
    }

    private void countsalery(){
        System.out.println(basicsalary+insentive);
    }

    //getter & setter
    String getName(){
        return name;
    }

    int getph(){
        return ph;
    }

    void setPh(int number){
        ph = number;
    }

    void setName(String naam){
        this.name = naam;
    }
}
