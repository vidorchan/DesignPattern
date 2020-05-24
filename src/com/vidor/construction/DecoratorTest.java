package com.vidor.construction;

public class DecoratorTest {
    public static void main(String[] args) {
        Component component = new ConcreteDecorator(new ConcreteComponent());
        component.operation();
    }
}

//抽象构件角色
interface Component {
    void operation();
}

//具体构件角色
class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("普通操作");
    }
}

//抽象装饰角色
class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}

//具体装饰角色
class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        addFunc();
    }

    public void addFunc() {
        System.out.println("装饰操作");
    }
}