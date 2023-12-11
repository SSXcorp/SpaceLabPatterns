package org.example.Creational.FactoryMethod;

public abstract class BrickBuildingFactory {
    public BrickBuilding create(){
        BrickBuilding building = createBrickBuilding();
        building.build();
        return building;
    }
    protected abstract BrickBuilding createBrickBuilding();
}
