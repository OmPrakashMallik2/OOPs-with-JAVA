package Incapsulation;
class Worker {
    private String name = "opm";
    private boolean gender = true;
    private int age = 25;
    private long phone = 654123987;
    private int salery = 20000;

    private void isReady(){
        System.out.println("Yes I am open to work.");
    }

    Worker(long mobile, int salery){
        phone = mobile;
        this.salery = salery;
    }

    long getPhone(){
        return phone;
    }

    String getName(){
        return name;
    }

    void setName(String naam){
        name = naam;
    }
}