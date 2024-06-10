package org.example.synchronised;

//Static synchronised object used class as monitor object that means instead of instance
//it used Class object
public class StaticSynchronese {
    public static Object object=null;

    public static synchronized Object getObject() {
        return object;
    }

    public static synchronized void setObject(Object object1) {
        object = object1;
    }

    public static void setObj(Object o){
        synchronized (StaticSynchronese.class){
            object=o;
        }
    }
    public static Object getObj(){
        synchronized (StaticSynchronese.class){
            return object;
        }
    }
}
