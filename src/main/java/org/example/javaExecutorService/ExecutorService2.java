package org.example.javaExecutorService;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorService2 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        executorService.shutdown();


        List<Runnable> list=executorService.shutdownNow();
        try{
            executorService.awaitTermination(3000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
