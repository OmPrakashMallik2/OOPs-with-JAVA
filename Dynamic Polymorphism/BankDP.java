class Bank {
    float rateOfIntrest() {
        return 0f;
    }
}

class SBI extends Bank {
    float rateOfIntrest() {
        return 8.5f;
    }
}

class ICICI extends Bank {
    float rateOfIntrest() {
        return 9.5f;
    }
}

class AXIS extends Bank {
    float rateOfIntrest() {
        return 11.5f;
    }
}

class BOI extends Bank {
    float rateOfIntrest() {
        return 12.5f;
    }
}

public class BankDP {
    public static void main(String[] args) {
        Bank b;

        b = new Bank();
        System.out.println(b.rateOfIntrest());

        b = new SBI();
        System.out.println(b.rateOfIntrest());

        b = new ICICI();
        System.out.println(b.rateOfIntrest());

        b = new AXIS();
        System.out.println(b.rateOfIntrest());

        b = new BOI();
        System.out.println(b.rateOfIntrest());
    }
}
