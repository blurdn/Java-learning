package NestedClasses;

public class Test {
    public static void main(String[] args) {
        Computer pc = new Computer(123);
        pc.turnOn();

        Computer.Battery battery = new Computer.Battery();
        battery.charge();
    }
}
