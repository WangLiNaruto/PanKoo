package com.naruto.designpatterns.creative.factory.method;

/**
 * 工厂方法类 - 继承AbstractFactory.
 * 集体实现createProduct方法.
 */
public class ProductFactory extends AbstractFactory{
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product=null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
