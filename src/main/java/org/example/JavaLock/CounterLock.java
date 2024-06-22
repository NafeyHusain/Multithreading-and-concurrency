package org.example.JavaLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {

    private long count=0;

    private final Lock lock=new ReentrantLock(true);
    public void inc(){
        try{
            lock.lock();
            this.count++;
        }finally {
            lock.unlock();
        }
    }

    private static void lockInteruption(){
        Lock lock1=new ReentrantLock();
        Thread.currentThread().interrupt();
        try {
            lock1.lockInterruptibly();
            lock1.unlock();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public long get(){
        try{
            lock.lock();
            return this.count;
        }finally {
            lock.unlock();
        }
    }
}
