package org.example.Creational.FactoryMethod;

public class ResidentialBuildingFactory extends BrickBuildingFactory {
    @Override
    protected BrickBuilding createBrickBuilding() {
        return new ResidentialBuilding();
    }
}
