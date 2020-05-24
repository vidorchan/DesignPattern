package com.vidor.action;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context();

        Strategy strategy = new ConcreteStrategyA();
        context.setStrategy(strategy);
        context.execute();

        Strategy strategy1 = new ConcreteStrategyB();
        context.setStrategy(strategy1);
        context.execute();
    }
}

interface Strategy {
    void strategyMethod();    //策略方法
}

class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}

class ConcreteStrategyB implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}

//环境类
class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void execute() {
        strategy.strategyMethod();
    }
}