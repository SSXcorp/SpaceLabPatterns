package org.example.Behavioral.ChainOfResponsibility;

class CDDisc implements Disc{
    private int size;

    public CDDisc(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void discInfo() {
        System.out.println("This is :" + getClass().getSimpleName());
        System.out.println("Size of disc is :" + getSize());
    }
}
