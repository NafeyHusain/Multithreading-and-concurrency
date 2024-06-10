package org.example.synchronised;

public class SharedMonitorObject {
    private Object monitor=null;

    private int counter=0;

    public SharedMonitorObject(Object monitor) {
        if(monitor==null){
            throw new IllegalArgumentException("Monitor cannot be null");
        }
        this.monitor = monitor;
    }
    public void incCounter(){
        synchronized (this.monitor){
            this.counter++;
        }
    }
}
