package com.vidor.construction;

public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("测试类适配器");
        Target adapter = new ClassAdapter();
        adapter.request();
    }
}

//目标接口
interface Target {
    void request();
}

//适配者接口
class Adapatee {
    void specialRequest() {
        System.out.println("特殊请求");
    }
}

//类适配器类
class ClassAdapter extends Adapatee implements Target {

    @Override
    public void request() {
        specialRequest();
    }
}
