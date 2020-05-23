package com.vidor.construction;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("测试对象适配器");
        Target adapter = new ObjectAdapter(new Adapatee());
        adapter.request();
    }
}

//对象适配器类
class ObjectAdapter implements Target {

    private Adapatee adapatee;

    public ObjectAdapter(Adapatee adapatee) {
        this.adapatee = adapatee;
    }

    @Override
    public void request() {
        adapatee.specialRequest();
    }
}
