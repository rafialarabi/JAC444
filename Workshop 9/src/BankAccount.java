/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 9
 * Date: 2021-08-03
 */


public class BankAccount {
    private double balance;
    private String currency;

    BankAccount(double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    //setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    //getters
    public double getBalance() {
        return this.balance;
    }

    public String getCurrency() {
        return this.currency;
    }

    // Deposit transaction
    synchronized void deposit(double amount, String currency) throws InterruptedException {
        System.out.println("\nDeposit is on process...");

        while(getBalance() != 0 && !getCurrency().equals(currency)){
            System.out.println("Amount to deposit: " + amount + " " + currency);
            System.out.println("Current currency: " + getCurrency());
            System.out.println("You are not allowed to deposit in a different currency");

            wait();
        }

        if (getCurrency().equals(currency)) {
            setCurrency(currency);
            setBalance(getBalance() + amount);
        } else {
            setCurrency(currency);
            setBalance(amount);
        }

        printBalance("Deposit", getBalance(), currency);
        notify();
    }

    // Withdrawal transaction
    synchronized void withdraw(double amount) throws Throwable {
        System.out.println("\nWithdraw is on process...");

        while (getBalance() < amount) {
            System.out.println("No sufficient funds available. Waiting for deposit...");

            wait();
        }

        if(getBalance() > 0.0){
            setBalance(getBalance() - amount);
            if (getBalance() > 0.0)
            printBalance("Withdrawal", getBalance(), getCurrency());
            else
            printBalance("Withdrawal", getBalance());
            notify();
        }
    }

    private void printBalance(String operation, double balance){
        System.out.println(operation + " finished.");
        System.out.println("New balance: " + balance);
    }

    private void printBalance(String operation, double balance, String currency){
        System.out.println(operation + " finished.");
        System.out.println("New balance: " + balance + " " + currency);
    }
}
