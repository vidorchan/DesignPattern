package com.vidor.create;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.createProduct("A").createProduct();
    }
}

class SimpleFactory {

    public IProduct createProduct(String type) {
        if ("A".equals(type)) {
            return new ProductA();
        } else if ("B".equals(type)) {
            return new ProductB();
        }
        return null;
    }
}

interface IProduct {
    void createProduct();
}

class ProductA implements IProduct {

    @Override
    public void createProduct() {
        System.out.println("Create a A Product...");
    }
}

class ProductB implements IProduct {
    @Override
    public void createProduct() {
        System.out.println("Create a B Product...");
    }
}
