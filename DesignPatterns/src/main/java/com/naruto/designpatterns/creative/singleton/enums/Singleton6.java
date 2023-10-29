package com.naruto.designpatterns.creative.singleton.enums;

/**
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * 描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化
 */
public enum Singleton6 {
    INSTANCE;

    //随便什么方法
    public Singleton6 getInstance() {
        return Singleton6.INSTANCE;
    }
}
