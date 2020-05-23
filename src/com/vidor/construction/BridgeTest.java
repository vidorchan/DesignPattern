package com.vidor.construction;

public class BridgeTest {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        new RefinedAbstraction(implementor).Operation();
    }
}

//实现化角色
interface Implementor {
    void OperationImpl();
}

//具体实现化角色
class ConcreteImplementorA implements Implementor {

    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问" );
    }
}

//抽象化角色
abstract class Abstraction {
    Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract void Operation();
}

//扩展抽象化角色
class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
        implementor.OperationImpl();
    }
}