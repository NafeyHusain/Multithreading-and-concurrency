package org.example.threadLocal;

public class ThreadLocalBasicExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal=new ThreadLocal<>();
        Thread thread1=new Thread(()->{
            threadLocal.set("Thread 1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String value= threadLocal.get();
            System.out.println(value);
            threadLocal.remove();
        });

        Thread thread2=new Thread(()->{
            threadLocal.set("Thread 2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String value= threadLocal.get();
            System.out.println(value);
            threadLocal.remove();
        });

        thread1.start();
        thread2.start();
    }
}
