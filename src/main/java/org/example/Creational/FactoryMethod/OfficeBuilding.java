package org.example.Creational.FactoryMethod;

public class OfficeBuilding implements BrickBuilding {
    @Override
    public void build() {
        System.out.println("Build new Office! | Строим новый офис!");
    }
}
