package com.vidor.create;

public class BuilderTest {
    public static void main(String[] args) {
        AbstractBuilder builder = new AbstractBuilderImpl();
        Director director = new Director(builder);
        Computer computer = director.construct();
        System.out.println(computer.toString());
    }
}

//指挥者：调用完成复杂对象构建
class Director {
    private AbstractBuilder builder;
    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Computer construct() {
        builder.buildCpu();
        return builder.getComputer();
    }
}

//具体构建者
class AbstractBuilderImpl extends AbstractBuilder {
    Computer computer = new Computer();

    @Override
    void buildCpu() {
        System.out.println("构建CPU");
        computer.setCpu("构建CPU");
    }

    @Override
    void buildMemory() {
        System.out.println("构建Memory");
    }

    @Override
    void buildScreen() {
        System.out.println("构建Screen");
    }

    @Override
    void buildMouse() {
        System.out.println("构建Mouse");
    }

    @Override
    void buildPower() {
        System.out.println("构建Power");
    }

    @Override
    void buildKeyboard() {
        System.out.println("构建Keyboard");
    }

    @Override
    void buildHost() {
        System.out.println("构建HOST");
    }

    @Override
    void buildRam() {
        System.out.println("构建RAM");
    }

    @Override
    void buildRom() {
        System.out.println("构建ROM");
    }

    @Override
    void buildGpu() {
        System.out.println("构建GPU");
    }

    @Override
    Computer getComputer() {
        return computer;
    }
}

//抽象建造者
abstract class AbstractBuilder{
    abstract void buildCpu();
    abstract void buildMemory();
    abstract void buildScreen();
    abstract void buildMouse();
    abstract void buildPower();
    abstract void buildKeyboard();
    abstract void buildHost();
    abstract void buildRam();
    abstract void buildRom();
    abstract void buildGpu();
    abstract Computer getComputer();
}


//产品角色
class Computer {
    private String cpu;
    private String memory;
    private String screen;
    private String mouse;
    private String power;
    private String keyboard;
    private String host;
    private String ram;
    private String rom;
    private String gpu;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", screen='" + screen + '\'' +
                ", mouse='" + mouse + '\'' +
                ", power='" + power + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", host='" + host + '\'' +
                ", ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
