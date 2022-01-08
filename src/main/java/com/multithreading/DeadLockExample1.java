package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLockExample1 {
    private DeadLockExample_A r1;
    private DeadLockExample_A r2;

    public void m1(DeadLockExample_A r1, DeadLockExample_A r2) {

        ExecutorService es = Executors.newCachedThreadPool();
        synchronized (r1) {
            //do some work
            System.out.println("Taken lock on R1 in m1()");
            try {
                Thread.sleep(1000);
                System.out.println("In the sleep in m1()");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (r2) {
                //Now waiting to take lock on this resource
                System.out.println("Taken lock on for R2 in m1()");
            }
        }
    }

    public void m2(DeadLockExample_A r1, DeadLockExample_A r2) {
        synchronized (r2) {
            //do some work
            System.out.println("Taken lock on R2 in m2()");
            try {
                Thread.sleep(2000);
                System.out.println("In the sleep in m2()");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (r1) {
                //Now waiting to take lock on this resource
                System.out.println("Taken lock on R1 in m2()");
            }
        }
    }

    public static void main(String[] args) {
        DeadLockExample1 deadLockExample1 = new DeadLockExample1();
        deadLockExample1.r1 = new DeadLockExample_A();
        deadLockExample1.r2 = new DeadLockExample_A();
        Runnable runnable1 = () -> {
            deadLockExample1.m1(deadLockExample1.r1, deadLockExample1.r2);
        };
        Runnable runnable2 = () -> {
            deadLockExample1.m1(deadLockExample1.r1, deadLockExample1.r2);
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        Thread thread2 = new Thread(runnable2);
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread");


    }
}

class DeadLockExample_A {
}