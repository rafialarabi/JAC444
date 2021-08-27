/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 9
 * Date: 2021-08-03
 */

import static java.lang.Thread.sleep;

public class Deposit implements Runnable{
    private final BankAccount sharedAccount;
    private final double[] balance;
    private final String[] currency;

    public Deposit(BankAccount sharedAccount, double[] balance, String[] currency) {
        this.sharedAccount = sharedAccount;
        this.balance = balance;
        this.currency = currency;
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("Deposit Thread initializing");
        while ( i >= 0 && i < balance.length) {
            synchronized (sharedAccount) {
                try {
                    sharedAccount.deposit(balance[i], currency[i]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    i++;
                    sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
