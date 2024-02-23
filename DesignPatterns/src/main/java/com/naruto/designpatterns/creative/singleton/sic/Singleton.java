package com.naruto.designpatterns.creative.singleton.sic;

/**
 * 静态内部类
 */
public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Singleton.SingletonHolder.INSTANCE;
    }
}
