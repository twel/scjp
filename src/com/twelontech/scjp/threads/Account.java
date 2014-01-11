package com.twelontech.scjp.threads;

/**
 * Created with IntelliJ IDEA.
 * User: twel0n
 * Date: 11-01-2014
 * Time: 0:55
 * To change this template use File | Settings | File Templates.
 */
public class Account {
    private int balance;

    Account(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amt) {
        balance = balance - amt;
    }
}
