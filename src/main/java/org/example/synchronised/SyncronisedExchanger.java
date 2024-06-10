package org.example.synchronised;

public class SyncronisedExchanger {

//    uses instance as a monitor object
    protected Object object=null;

    public synchronized Object getObject() {
        return object;
    }

    public synchronized void setObject(Object object) {
        this.object = object;
    }

    public void setObj(Object o){

//        this is called monitor object
        synchronized (this){
            this.object=o;
        }
    }
    public Object getObj(){
        synchronized (this){
            return this.object;
        }
    }
}
