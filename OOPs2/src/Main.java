import Encapsulation.*;

public class Main {
    public static void main(String[] args) {
        Account ac = new Account(1215, "opm", 54685, 6548);
        ac.checkBalance();
        ac.debitBalance(666600);
    }
}
