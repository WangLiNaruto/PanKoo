package com.naruto.designpatterns.creative.singleton.hungry;

/**
 * 饿汉式 - 静态变量
 */
public class Singleton {
    // 类加载时被初始化 Singleton 类的实例
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    // 实例的全局访问点
    public static Singleton getInstance() {
        return INSTANCE;
    }
}