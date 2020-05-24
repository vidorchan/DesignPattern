package com.vidor.construction;

import java.util.HashMap;

public class FlyWeightFactoryTest {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        FlyWeight f1 = flyWeightFactory.getFlyWeight("a");
        FlyWeight f2 = flyWeightFactory.getFlyWeight("a");
        f1.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        f2.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
    }
}

class FlyWeightFactory {
    private HashMap<String, FlyWeight> flyWeightHashMap = new HashMap<>();

    public FlyWeight getFlyWeight(String key) {
        FlyWeight flyWeight = flyWeightHashMap.get(key);
        if (flyWeight == null) {
            flyWeight = new ConcreteFlyweight(key);
            flyWeightHashMap.put(key, flyWeight);
        } else {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        }
        return flyWeight;
    }
}

class ConcreteFlyweight implements FlyWeight {

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + state.getInfo());
    }
}

interface FlyWeight {
    public void operation(UnsharedConcreteFlyweight state);
}

class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
