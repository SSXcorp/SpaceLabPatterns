package org.example.Creational.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        BrickBuildingFactory officeFactory = new OfficeBuildingFactory();
        BrickBuilding officeBuilding = officeFactory.create();

        BrickBuildingFactory residentialFactory = new ResidentialBuildingFactory();
        BrickBuilding residentialBuilding = residentialFactory.create();

        System.out.println(officeBuilding.getClass());
        System.out.println(residentialBuilding.getClass());

    }
}
