package com.SOLIDPrinciples;

interface Keyboard {
    void connect();
}

class WiredKeyboard implements Keyboard {
    @Override
    public void connect() {
        System.out.println("Wired keyboard connected via USB.");
    }
}

class WirelessKeyboard implements Keyboard {
    @Override
    public void connect() {
        System.out.println("Wireless keyboard connected via Bluetooth.");
    }
}


class Computer {
    private Keyboard keyboard;

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void useKeyboard() {
        keyboard.connect(); 
    }
}

public class DIPKeyboardDemo {
    public static void main(String[] args) {
        Keyboard wired = new WiredKeyboard();
        Keyboard wireless = new WirelessKeyboard();

        Computer computer1 = new Computer(wired);
        Computer computer2 = new Computer(wireless);

        System.out.println("Computer 1:");
        computer1.useKeyboard();

        System.out.println("Computer 2:");
        computer2.useKeyboard();
    }
}
