package org.example.threadLocal;

public class ThreadLocalInitialValueExcample2 {

    ThreadLocal<Object> threadLocal1=new ThreadLocal<>(){
        @Override
        protected Object initialValue(){
            return new Object();
        }
    };

    ThreadLocal<Object> threadLocal2= ThreadLocal.withInitial(() -> new Object());
}
