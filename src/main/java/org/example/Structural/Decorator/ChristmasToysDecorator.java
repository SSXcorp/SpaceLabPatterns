package org.example.Structural.Decorator;

public class ChristmasToysDecorator extends TreeDecorator {

    public ChristmasToysDecorator(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithChristmasToys();
    }

    private String decorateWithChristmasToys() {
        return " with Christmas toys";
    }
}
