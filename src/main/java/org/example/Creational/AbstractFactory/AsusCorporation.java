package org.example.Creational.AbstractFactory;

public class AsusCorporation extends Corporation {
    @Override
    public Laptop createLaptop() {
        return new AsusLaptop();
    }
    @Override
    public PC createPC() {
        return new AsusPC();
    }
}
