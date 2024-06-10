package org.example.Chapter1;

public class ThreadExample4 {
    public static class Stoppablerunnable implements Runnable{
        private boolean stopRequested=false;

        public synchronized void requestStop(){
            this.stopRequested=true;
        }

        public synchronized boolean isStopRequested(){
            return this.stopRequested;
        }

        private void sleep(long millis){
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        @Override
        public void run() {
            System.out.println("Stoppable Runnable Running");
            while (!isStopRequested()){
                sleep(1000);
                System.out.println("......");
            }
            System.out.println("StoppableRunnable Stopped");
        }
    }

    public static void main(String[] args) {
        Stoppablerunnable stoppablerunnable=new Stoppablerunnable();
        Thread thread=new Thread(stoppablerunnable,"The Thread");
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Requesting stop");
        stoppablerunnable.requestStop();
        System.out.println("stop requested");

    }
}
