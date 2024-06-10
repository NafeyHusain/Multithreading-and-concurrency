package org.example.virtualThread;

public class VirtualThread {


    public static void main(String[] args) {
        Runnable runnable= () -> {
          for(int i=0;i<10;i++){
              System.out.println("Index : " +i);
          }
        };

//        Thread vThread1=Thread.ofVirtual().start(runnable);

//        Thread vThread1=Thread.ofVirtual().unstart(runnable);
    }
}
