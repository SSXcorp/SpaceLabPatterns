package org.example.Structural.Bridge;

public class DefaultCustomization implements ToyCustomizator{

    protected Toy toy;

    public DefaultCustomization() {}

    public DefaultCustomization(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void paint() {
        System.out.println("Printing in RED (DEFAULT) colour");
    }

    @Override
    public void size() {
        System.out.println("Default size is XL");
    }

    @Override
    public void material() {
        System.out.println("Default material is Metal");
    }
}
