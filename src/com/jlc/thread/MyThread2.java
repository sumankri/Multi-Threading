package com.jlc.thread;

public class MyThread2 extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            Thread.yield();
            System.out.println("Thread2 - run -> " + i);
        }
    }
}
