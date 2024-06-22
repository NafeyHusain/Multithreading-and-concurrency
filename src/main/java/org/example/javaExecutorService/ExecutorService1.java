package org.example.javaExecutorService;

import java.util.concurrent.*;

public class ExecutorService1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int corePoolsize=10;
        int maxPoolSize=200;
        long keepAliveTime=3000;

        ExecutorService executorService=new ThreadPoolExecutor(
                corePoolsize,
                maxPoolSize,
                keepAliveTime,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(128)
        );

        executorService= Executors.newFixedThreadPool(10);
        ScheduledExecutorService scheduledExecutorService=new
                ScheduledThreadPoolExecutor(corePoolsize);

        Future future=executorService.submit(new Runnable() {
            @Override
            public void run() {
            }
        });

        future.get();

        System.out.println(future.isDone());

        executorService.shutdownNow();

    }
}
