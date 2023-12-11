package org.example.Creational.Prototype;

public abstract class Tree {
    public int height;
    public String family;
    public int age;

    public Tree() {}

    public Tree(Tree tree) {
        this.height = tree.height;
        this.family = tree.family;
        this.age = tree.age;
    }

    public abstract Tree clone();
}
