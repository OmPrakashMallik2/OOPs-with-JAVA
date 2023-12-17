package Inheritance;

public class Bird extends Animal {
    private boolean canFly;
    private String color;
    private boolean isVegetarian;

    public Bird(String name, String gender, String sound, boolean canFly, String color, boolean isVegetarian) {
        super(name, gender, sound);
        this.canFly = canFly;
        this.color = color;
        this.isVegetarian = isVegetarian;
    }

    public void birdDetails() {
        animalDetails();
        System.out.println("Bird [" +
                "canFly=" + canFly +
                ", color='" + color + '\'' +
                ", isVegetarian=" + isVegetarian +
                "]");
    }
}

