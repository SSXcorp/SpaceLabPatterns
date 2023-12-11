package org.example.Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Oak oak1 = new Oak();
        oak1.setTrunkRadius(122);
        Oak oak2 = (Oak) oak1.clone();

        System.out.println("Oak1 hashcode : " + oak1.hashCode() + " Trunk radius : " + oak1.getTrunkRadius());
        System.out.println("Oak2 hashcode : " + oak2.hashCode() + " Trunk radius : " + oak2.getTrunkRadius());

    }
}
