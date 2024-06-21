package org.example.race.condition;

public class SynchronisedCounter {

    public long counter=0;

    public long getCounter() {
        synchronized (this){
            return this.counter;
        }
    }

    public long incAndGet() {
        synchronized (this){
            this.counter++;
            return this.counter;
        }
    }
}
