package com.naruto.designpatterns.creative.singleton.hungry;

/**
 * 饿汉式 - 静态变量
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}