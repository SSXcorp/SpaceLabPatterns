package org.example.Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Corporation asus = new AsusCorporation();
        PC asusPC = asus.createPC();
        Laptop asusLaptop = asus.createLaptop();

        Corporation apple = new AppleCorporation();
        PC applePC = apple.createPC();
        Laptop appleLaptop = apple.createLaptop();

        System.out.println("Asus PC : " + asusPC.toString() + " |  Asus laptop : " + asusLaptop.toString());
        asusPC.sayHi();
        System.out.println("Apple PC : " + applePC.toString() + " |  Apple laptop : " + appleLaptop.toString());
        applePC.sayHi();


    }
}
