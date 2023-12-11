package org.example.Structural.Bridge;

public class LuxuryCustomization implements ToyCustomizator{

    protected Toy toy;

    public LuxuryCustomization() {}

    public LuxuryCustomization(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void paint() {
        System.out.println("Printing in RoseGold luxury colour");
    }

    @Override
    public void size() {
        System.out.println("Luxury size is XXL");
    }

    @Override
    public void material() {
        System.out.println("Luxury material is Carbon");
    }
}
