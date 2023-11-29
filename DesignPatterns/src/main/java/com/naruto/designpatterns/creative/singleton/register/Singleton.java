package com.naruto.designpatterns.creative.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例模式
 */
public class Singleton {

    private static Map<String, Singleton> instances = new ConcurrentHashMap<>();
    static {
        instances.put(Singleton.class.getName(), new Singleton());
    }
    private Singleton() {}
    public static Singleton getInstance() {
        return instances.get(Singleton.class.getName());
    }
    public static void register(String key, Singleton instance) {
        instances.put(key, instance);
    }
    public static Singleton getRegisteredInstance(String key) {
        return instances.get(key);
    }
}
