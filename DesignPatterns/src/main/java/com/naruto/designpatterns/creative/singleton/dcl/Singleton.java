package com.naruto.designpatterns.creative.singleton.dcl;

/**
 * 双重校验锁 - DCL(double-checked locking)
 */
public class Singleton {

    //volatile 关键字可以确保 singleton 变量的可见性和有序性，从而保证多线程环境下的正确性
    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
