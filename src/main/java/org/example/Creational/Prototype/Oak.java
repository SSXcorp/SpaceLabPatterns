package org.example.Creational.Prototype;

public class Oak extends Tree{
    private int trunkRadius;

    public void setTrunkRadius(int trunkRadius) {
        this.trunkRadius = trunkRadius;
    }

    public int getTrunkRadius() {
        return trunkRadius;
    }

    public Oak() {}
    public Oak(Oak oak) {
        super(oak);
        this.trunkRadius = oak.trunkRadius;
    }

    @Override
    public Oak clone() {
        System.out.println("Cloned Oak object");
        return new Oak(this);
    }

}
