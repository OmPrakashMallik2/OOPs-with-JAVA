class Account {
    int acc_n;
    String name;
    float amount;

    // methode to insert a costumer
    void insert(int account_number, String name, float amount) {
        acc_n = account_number;
        this.name = name;
        this.amount = amount;
    }

    // credit amount;
    void credit(float x) {
        amount += x;
        System.out.println(x + " credited in your account.");
    }

    // debited amount;
    void debit(float x) {
        amount -= x;
        System.out.println(x + " dedited in your account.");
    }

    // debited amount;
    void balance() {
        System.out.println("Available balance in your account is : " + amount);
    }

    void details() {
        System.out.println(acc_n + " " + name + " " + amount);

    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account custumer1 = new Account();
        custumer1.insert(143, "Om Prakash Mallik", 100000);
        custumer1.balance();

        custumer1.credit(105);
        custumer1.debit(12);
        custumer1.balance();

        custumer1.details();
    }
}
