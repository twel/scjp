package com.twelontech.scjp.threads;

/**
 * Created with IntelliJ IDEA.
 * User: twel0n
 * Date: 10-01-2014
 * Time: 0:28
 * To change this template use File | Settings | File Templates.
 */
public class MySleepingThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(1000);//minimo tempo garantido
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

            if (i % 10 == 0) {
                System.out.println("Count: " + i);
            }
        }
    }

    public static void main(String[] args) {
        MySleepingThread t = new MySleepingThread();
        t.start();
    }
}
