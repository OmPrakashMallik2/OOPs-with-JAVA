package Encapsulation;

public class OnlineBankingSystem {
    public static void main(String[] args) {
        System.out.println("Online Banking System");
//        Account customer1 = new Account(195590, "Om Prakash Mallik", 1250, 2025);
//        customer1.accountDetails();
        Account customer2 = new Account(848213, "Jay Prakash Mallik", 1520, 2024);
        customer2.accountDetails();
        customer2.creditBalance(1500);
        customer2.checkBalance();
        System.out.println(customer2.getPin());
        customer2.changePin(1234);
        System.out.println(customer2.getPin());
        Account.setBranch("DBG");
        Account.getBranch();
    }
}
