package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Runnable runnable1=new MyRunnable();
        Runnable runnable2=new MyRunnable();

        Thread thread1=new Thread(runnable1);
        Thread thread2=new Thread(runnable2);

        thread1.start();
        thread2.start();

    }
}