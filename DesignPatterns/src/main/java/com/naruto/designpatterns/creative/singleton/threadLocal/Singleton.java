package com.naruto.designpatterns.creative.singleton.threadLocal;

/**
 * ThreadLocal单例模式
 */
public class Singleton {
    // ThreadLocal单例模式这种实现方式将单例对象存储在ThreadLocal中，每个线程都有自己的单例对象副本，保证了线程安全
    private static final ThreadLocal<Singleton> singletonThreadLocal = new ThreadLocal<Singleton>() {
        @Override
        protected Singleton initialValue() {
            return new Singleton();
        }
    };

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singletonThreadLocal.get();
    }
}
