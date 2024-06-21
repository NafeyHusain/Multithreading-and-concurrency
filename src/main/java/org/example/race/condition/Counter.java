package org.example.race.condition;

public class Counter {

    public long counter=0;

    public long getCounter() {
        return this.counter;
    }

    public long incAndGet() {
        this.counter++;
        return this.counter;
    }
}
