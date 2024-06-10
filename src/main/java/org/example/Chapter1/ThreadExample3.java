package org.example.Chapter1;

public class ThreadExample3 {
    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("&&&&&");
        }
    }

    public static void main(String[] args) {
        Thread thread =new Thread(new MyRunnable());
        thread.start();

        Runnable runnable= () ->{
            String threadName = Thread.currentThread().getName();
            System.out.println("skasdfasd");
        };
        Thread thread1=new Thread(runnable);
        thread1.start();
    }
}
