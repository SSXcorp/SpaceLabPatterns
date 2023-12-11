package org.example.Creational.Prototype;

public class Pine extends Tree {
    private int numberOfCones;

    public Pine() {}

    public Pine(Pine pine) {
        super(pine);
        this.numberOfCones = pine.numberOfCones;
    }

    @Override
    public Pine clone() {
        return new Pine(this);
    }


}
