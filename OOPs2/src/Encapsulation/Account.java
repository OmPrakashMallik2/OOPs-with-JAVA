package Encapsulation;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private int pin;
    static String branch;

    public Account(int accountNumber, String accountHolderName, int balance, int pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.pin = pin;
        branch = "PATNA";
    }


    public void accountDetails () {
        System.out.println("Account [" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", pin=" + pin +
                ", branch=" +  branch+
                "]");
    }

    public void creditBalance(double money){
        if(money > 0){
            this.balance += money;
            System.out.println("Rs. "+ money+" is credited to the account number "+accountNumber);
        } else {
            System.out.println("invalid credit amount");
        }
        System.out.println("new current balance : "+getBalance());
    }

    public void debitBalance(double money){
        if(money <= getBalance()){
            this.balance -= money;
            System.out.println("Rs. "+ money+" is debited from the account number "+accountNumber);
        } else {
            System.out.println("Insufficient balance in your account");
        }
        System.out.println("new current balance : "+getBalance());
    }

    public void checkBalance() {
        System.out.println("Current balance is : "+balance);
    }

    public void changePin(int newPin){
        if(validPin(newPin)){
            this.pin = newPin;
        } else {
            System.out.println("Please change with a valid four digit pin number");
        }
        System.out.println("The new pin number is :"+newPin);
    }

    private boolean validPin(int pin) {
        if(pin >= 1000 && pin <= 9999){
            return true;
        }
        return false;
    }

    // getters

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public static void getBranch() {
//        return branch;
        System.out.println("Branch name is : "+branch);
    }

    // setters

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public static void setBranch(String branch) {
        Account.branch = branch;
    }
}
