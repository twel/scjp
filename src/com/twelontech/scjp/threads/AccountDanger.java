package com.twelontech.scjp.threads;

/**
 * Created with IntelliJ IDEA.
 * User: twel0n
 * Date: 11-01-2014
 * Time: 0:38
 * To change this template use File | Settings | File Templates.
 */
public class AccountDanger implements Runnable {
    private Account acct = new Account(20);

    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    // without synchronized we can't assure that the operation is atomic, the account will be overdrawn
    synchronized private void makeWithdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawl");
        }
        else{
            System.out.println("" + Thread.currentThread().getName() + " to withdraw " + acct.getBalance());
        }
    }


    public static void main(String[] args) {
        AccountDanger r = new AccountDanger();
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        one.setName("Fred");
        two.setName("Lucy");
        one.start();
        two.start();
    }
}
