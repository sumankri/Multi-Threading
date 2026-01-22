package com.jlc.thread;

public class ThreadDemoPriority {
    public static void main(String[] args) throws InterruptedException{

        MyThread1 t1=new MyThread1();
        System.out.println("priority of t1 - " + t1.getPriority());
        System.out.println("priority of main - " + Thread.currentThread().getPriority());
        t1.start();
        t1.join();
        for (int i=1;i<=5;i++){
            System.out.println("Main Thread - " + i);
        }
    }
}
