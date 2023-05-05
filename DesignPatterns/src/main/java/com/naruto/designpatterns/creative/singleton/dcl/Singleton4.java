package com.naruto.designpatterns.creative.singleton.dcl;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 */
public class Singleton4 {
    private volatile static Singleton4 singleton4;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }


}
