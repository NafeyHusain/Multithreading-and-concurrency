package org.example.race.condition;

public class RaceRoundCondition {
    public static void main(String[] args) {
        Counter counter=new Counter();
        Thread thread1=new Thread(getRunnable(counter,"Thread 1 count "));
        Thread thread2=new Thread(getRunnable(counter,"Thread 2 count "));
    }


    public static Runnable getRunnable(Counter counter, String message){
        return () -> {
            for (int i=0;i<100000;i++){
                counter.incAndGet();
            }
            System.out.println(message + counter);
        };
    }
}
