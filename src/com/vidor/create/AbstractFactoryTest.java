package com.vidor.create;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        IabstractFactory iabstractFactory = new AbstractFactory();
        iabstractFactory.createProductA().createProduct();
        iabstractFactory.createProductB().createProduct();
    }
}

interface IabstractFactory{
    IProduct createProductA();
    IProduct createProductB();
}

class AbstractFactory implements IabstractFactory{

    @Override
    public IProduct createProductA() {
        return new ProductA();
    }

    @Override
    public IProduct createProductB() {
        return new ProductB();
    }
}