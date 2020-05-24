package com.vidor.create;

public class FactoryTest {
    public static void main(String[] args) {
        IFactory iFactory = new FactoryB();
        iFactory.createProduct().createProduct();
    }
}

interface IFactory {
    IProduct createProduct();
}

class FactoryA implements IFactory {

    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}

class FactoryB implements IFactory {

    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}