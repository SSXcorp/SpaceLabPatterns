package org.example.Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        RoboDino rd = new RoboDino();
        SpaceWarrior sw = new SpaceWarrior();
        testToy(rd);
        testToy(sw);
    }

    public static void testToy(Toy toy) {
        toy.turnOn();
        toy.dance();
        toy.turnOff();

        System.out.println("Tests toy with default customization.");
        DefaultCustomization defaultCustomization = new DefaultCustomization(toy);
        defaultCustomization.paint();
        defaultCustomization.size();
        defaultCustomization.material();

        System.out.println("Tests toy with luxury customization.");
        LuxuryCustomization luxuryCustomization = new LuxuryCustomization(toy);
        luxuryCustomization.paint();
        luxuryCustomization.size();
        luxuryCustomization.material();
    }
}
