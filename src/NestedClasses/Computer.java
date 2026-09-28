package NestedClasses;

public class Computer {
    private final int id;

    // non-static nested class
    // used inside a class when it's too complicated
    // also has access to private fields
    private class CPU {
        public void renderImage() {
            System.out.println("Processor " + id + " is rendering the image...");
        }
    }

    // nested static class
    // usually used outside a class
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Computer(int id) {
        this.id = id;
    }

    public void turnOn() {
        System.out.println("Computer " + id + " is starting...");

        float btc = 0.00000000001f;

        // nested classes in methods! (also called local classes)
        // has access to only final or effectively final local variables
        class BTCMiner {
            public void mineBTC() {
                System.out.println("Began the mining... Current BTC balance is " + btc);
            }
        }

        CPU cpu = new CPU();
        cpu.renderImage();
    }
}
