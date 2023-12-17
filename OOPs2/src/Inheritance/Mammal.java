package Inheritance;
public class Mammal extends Animal{
    private String mammalColor;
    private String mammalMaxWeight;
    private String mammalMaxSize;
    private boolean milkProduction;

    public Mammal(String name, String gender, String sound, String mammalColor, String mammalMaxWeight, String mammalMaxSize, boolean milkProduction) {
        super(name, gender, sound);
        this.mammalColor = mammalColor;
        this.mammalMaxWeight = mammalMaxWeight;
        this.mammalMaxSize = mammalMaxSize;
        this.milkProduction = milkProduction;
    }

    public void mammalDetails() {
        animalDetails();
        System.out.println("Mammal [" +
                "mammalColor='" + mammalColor + '\'' +
                ", mammalMaxWeight='" + mammalMaxWeight + '\'' +
                ", mammalMaxSize='" + mammalMaxSize + '\'' +
                ", milkProduction=" + milkProduction +
                "]");
    }
}
