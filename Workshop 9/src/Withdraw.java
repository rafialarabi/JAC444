/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 9
 * Date: 2021-08-03
 */

import static java.lang.Thread.sleep;

public class Withdraw implements Runnable{
    private final BankAccount sharedAccount;
    private final int size;

    public Withdraw(BankAccount sharedAccount, double[] deposit) {
        this.sharedAccount = sharedAccount;
        this.size = deposit.length;
    }

    @Override
    public void run() {
        System.out.println("Withdraw Thread initializing");
        for (int i = 0; i < size; i++) {
            synchronized(sharedAccount) {
                try {
                    sharedAccount.withdraw(1);
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
