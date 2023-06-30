package Inheritance;

public class Me extends Papa{
    public String name = "Om Prakash";
}

class Papa extends DadaG{
    String name = "Santosh";
}

class DadaG {
    String name = "Baldev";
    private int jameen = 5;
    public String surname = "Mallik";

    public int getJameen(){
        return jameen;
    }
}

