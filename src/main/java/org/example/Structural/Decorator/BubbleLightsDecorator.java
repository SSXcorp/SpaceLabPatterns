package org.example.Structural.Decorator;

public class BubbleLightsDecorator extends TreeDecorator {

    public BubbleLightsDecorator(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
