
class Bank {
    int getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    int getInterestRate() {
        return 8;
    }
}

class ICICI extends Bank {
    int getInterestRate() {
        return 9;
    }
}

class AXIS extends Bank {
    int getInterestRate() {
        return 10;
    }
}

public class RealLifeExample {
    public static void main(String[] args) {
        System.out.println("Real Life Example of Overriding.");
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println(sbi.getInterestRate());
        System.out.println(icici.getInterestRate());
        System.out.println(axis.getInterestRate());
    }
}
