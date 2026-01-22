package com.jlc.thread;

public class Thread_1 extends Thread{

    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Thread_1 - " + i);

            System.out.println("I am entered into sleeping stage!");
            try{
                Thread.sleep(20);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

}
