package org.example.Structural.Decorator;

import com.sun.source.tree.Tree;

public class ExtraGarlandTreeDecorator extends TreeDecorator{

    public ExtraGarlandTreeDecorator(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with extra Garland";
    }
}
