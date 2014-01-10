package com.twelontech.scjp.threads;

/**
 * Created with IntelliJ IDEA.
 * User: twel0n
 * Date: 09-01-2014
 * Time: 22:30
 * To change this template use File | Settings | File Templates.
 */
// Creating Threads: Extending main.java.lang.Thread
public class MyThread extends Thread {
    public void run(){
        System.out.println("Important job running in MyThread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Creating Threads: Extending main.java.lang.Thread");
        System.out.println("Current thread is: " + Thread.currentThread().getName());

        MyThread t1 = new MyThread();
        t1.setName("vega");
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();

        MyThread t3 = new MyThread();
        t3.start();
    }
}
