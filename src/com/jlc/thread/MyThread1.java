package com.jlc.thread;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("MyThread  1 - " + i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
