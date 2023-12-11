package org.example.Creational.FactoryMethod;

public class ResidentialBuilding implements BrickBuilding {
    @Override
    public void build() {
        System.out.println("Build Residential building! | Строим жилое здание!");
    }
}
