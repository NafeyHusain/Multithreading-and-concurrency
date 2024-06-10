package org.example.Chapter1;

public class ThreadExample2 {

    public static class Mythread extends Thread{
        public void run(){
            System.out.println("MyThread running");
            System.out.println("MyThread Finished");
        }
    }
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        mythread.start();
    }
}
