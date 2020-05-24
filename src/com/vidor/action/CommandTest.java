package com.vidor.action;

import java.util.ArrayList;

public class CommandTest {
    public static void main(String[] args) {
        AbstractCommand command = new ConcreteCommand1();
        AbstractCommand command1 = new ConcreteCommand2();

        CompositeInvoker invoker = new CompositeInvoker();
        invoker.add(command);
        invoker.add(command1);
        invoker.execute();
    }
}

//抽象命令
interface AbstractCommand {
    void execute();
}

//树叶构件: 具体命令1
class ConcreteCommand1 implements AbstractCommand
{
    private CompositeReceiver receiver;
    ConcreteCommand1() {
        receiver = new CompositeReceiver();
    }
    public void execute() {
        receiver.action1();
    }
}

//树叶构件: 具体命令2
class ConcreteCommand2 implements AbstractCommand
{
    private CompositeReceiver receiver;
    ConcreteCommand2() {
        receiver = new CompositeReceiver();
    }
    public void execute() {
        receiver.action2();
    }
}

//树枝构件: 调用者
class CompositeInvoker implements AbstractCommand {
    private ArrayList<AbstractCommand> children = new ArrayList<AbstractCommand>();
    public void add(AbstractCommand c) {
        children.add(c);
    }
    public void remove(AbstractCommand c) {
        children.remove(c);
    }
    public AbstractCommand getChild(int i) {
        return children.get(i);
    }
    public void execute() {
        for(Object obj:children)
        {
            ((AbstractCommand)obj).execute();
        }
    }
}

//接收者
class CompositeReceiver
{
    public void action1() {
        System.out.println("接收者的action1()方法被调用...");
    }
    public void action2() {
        System.out.println("接收者的action2()方法被调用...");
    }
}