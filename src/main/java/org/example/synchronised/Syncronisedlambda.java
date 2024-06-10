package org.example.synchronised;

import java.util.function.Consumer;

public class Syncronisedlambda {
    private static Object object=null;

    public static synchronized void setObject(Object o){
        object=o;
    }

    public static void consumeObject(Consumer consumer){
        consumer.accept(object);
    }

    public static void main(String[] args) {
        consumeObject((obj)->{
            synchronized (Syncronisedlambda.class){
                System.out.println(obj);
            }
        });
    }
}
