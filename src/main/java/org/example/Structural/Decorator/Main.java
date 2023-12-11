package org.example.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        ChristmasTree tree1 = new ChristmasTreeImpl();
        System.out.println(tree1.decorate());

        ChristmasTree tree2 = new ExtraGarlandTreeDecorator(new ChristmasToysDecorator(tree1));
        System.out.println(tree2.decorate());

    }
}
