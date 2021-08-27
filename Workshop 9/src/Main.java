/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 9
 * Date: 2021-08-03
 */

public class Main {

    public static void main(String[] args) {

        double[] balance = {1, 2, 3};
        String[] currency = {"Dollar", "Euros", "Pounds"};
        BankAccount sharedAccount = new BankAccount(0, "");


        Thread withdraw = new Thread(new Withdraw(sharedAccount, balance));
        Thread deposit = new Thread(new Deposit(sharedAccount, balance, currency));


        withdraw.start();
        deposit.start();

        try {
            withdraw.join();
            deposit.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
