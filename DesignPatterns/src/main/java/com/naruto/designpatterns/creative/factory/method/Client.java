package com.naruto.designpatterns.creative.factory.method;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ProductFactory();
        Product product1 = factory.createProduct(Product1.class);
        Product product2 = factory.createProduct(Product2.class);
        product1.method1();
        product1.method2();
        product2.method1();
        product2.method2();
    }
}
