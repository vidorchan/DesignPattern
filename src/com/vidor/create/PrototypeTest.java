package com.vidor.create;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        Prototype prototype1 = prototype.clone();
        System.out.println(prototype==prototype1);
    }
}

class Prototype implements Cloneable{
    Prototype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Prototype) super.clone();
    }
}
