package org.example.Creational.AbstractFactory;

public class AppleCorporation extends Corporation {
    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
    @Override
    public PC createPC() { return new ApplePC(); }
}
