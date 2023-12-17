package Inheritance;

public class Animal {
    private String name;
    private String gender;
    private String sound;

    public Animal(String name, String gender, String sound) {
        this.name = name;
        this.gender = gender;
        this.sound = sound;
    }

    public void animalDetails() {
//        animalDetails();
        System.out.println( "Animal [" +
                "name='" + name + '\'' +
                "gender='" + gender + '\'' +
                ", sound='" + sound + '\'' +
                "]");
        eat();
        sleep();
        move();
        typeOfSound();
    }

    public void eat(){
        System.out.println("Eats");
    }

    public void sleep(){
        System.out.println("Sleeps");
    }

    public void move(){
        System.out.println("Moves");
    }

    public void typeOfSound(){
        System.out.println("Makes sounds");
    }
}
