abstract class Bank {
    abstract void rateOfInterest();
}

class SBI extends Bank {
    void rateOfInterest() {
        System.out.println("5%");
    }
}

class AXIS extends Bank {
    void rateOfInterest() {
        System.out.println("6%");
    }
}

class ICICI extends Bank {
    void rateOfInterest() {
        System.out.println("7%");
    }
}

class BOI extends Bank {
    void rateOfInterest() {
        System.out.println("8%");
    }
}

public class TestAbstraction2 {
    public static void main(String[] args) {
        Bank sbi, icici, axis, boi;
        sbi = new SBI();
        sbi.rateOfInterest();

        icici = new ICICI();
        icici.rateOfInterest();

        axis = new SBI();
        axis.rateOfInterest();

        boi = new SBI();
        boi.rateOfInterest();
    }
}
