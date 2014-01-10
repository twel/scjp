package com.twelontech.scjp.threads;

/**
 * Created with IntelliJ IDEA.
 * User: twel0n
 * Date: 09-01-2014
 * Time: 22:36
 * To change this template use File | Settings | File Templates.
 */
// Creating Threads: Implementing main.java.lang.Runnable
public class MyRunnable implements Runnable {
    public void run(){
        System.out.println("Important job running in MyRunnable: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Creating Threads: Implementing main.java.lang.Runnable");
        System.out.println("Current thread is: " + Thread.currentThread().getName());

        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.setName("vega");
        thread2.start();

        Thread thread3 = new Thread(runnable);
        thread3.start();
    }
}
