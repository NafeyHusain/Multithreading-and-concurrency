package org.example.Chapter1;

public class ThreadExample5 {

    public static void main(String[] args)  {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                while (true){
                    sleep(1000);
                    System.out.println("Running");
                }
            }
        };
        Thread thread=new Thread(runnable);

//       will shut down all the threads if the parent thread stops
        thread.setDaemon(true);
        thread.start();
        sleep(3100);

        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                int i=0;
                while (i<5){
                    sleep(1000);
                    i++;
                    System.out.println("Running");
                }
            }
        };
        Thread thread1=new Thread(runnable);

//       will shut down all the threads if the parent thread stops
        thread1.setDaemon(true);
        thread1.start();
        try {
//            will wait untill the daemon threads closes
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sleep(3100);

    }

    private static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
