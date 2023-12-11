package org.example.Creational.FactoryMethod;

public class OfficeBuildingFactory extends BrickBuildingFactory {
    @Override
    protected BrickBuilding createBrickBuilding() {
        return new OfficeBuilding();
    }
}
