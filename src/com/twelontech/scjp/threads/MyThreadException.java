package com.twelontech.scjp.threads;

/**
 * Created with IntelliJ IDEA.
 * User: twel0n
 * Date: 09-01-2014
 * Time: 23:33
 * To change this template use File | Settings | File Templates.
 */
public class MyThreadException {
    public void run() {
        System.out.println("Important job running in MyThread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Running start() method again and raising an exception");
        System.out.println("Current thread is: " + Thread.currentThread().getName());

        MyThread t1 = new MyThread();
        t1.setName("vega");
        t1.start();

        try {
            t1.start();
        } catch (IllegalThreadStateException ex) {
            System.out.println("Thread already started!!!");
        }
    }
}
