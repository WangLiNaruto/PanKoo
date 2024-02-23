package com.naruto.designpatterns.creative.factory.method;

/**
 * 抽象工厂.
 * 有个抽象方法，用于生产产品T(继承与Product)
 */
public abstract class AbstractFactory {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
