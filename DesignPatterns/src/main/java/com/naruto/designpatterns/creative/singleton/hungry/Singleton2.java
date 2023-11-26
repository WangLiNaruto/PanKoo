package com.naruto.designpatterns.creative.singleton.hungry;

/**
 * 饿汉式 - 静态代码快
 */
public class Singleton2 {
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}