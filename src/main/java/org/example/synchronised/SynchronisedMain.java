package org.example.synchronised;

public class SynchronisedMain {
    public static void main(String[] args) {

        SyncronisedExchanger syncronisedExchanger=new SyncronisedExchanger();

        Thread thread1=new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<1000;i++){
                            syncronisedExchanger.setObject(""+i);
                        }
                    }
                }
        );

        Thread thread2=new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<1000;i++){
                            System.out.println(syncronisedExchanger.getObject());
                        }
                    }
                }
        );
        thread1.start();
        thread2.start();
    }
}
