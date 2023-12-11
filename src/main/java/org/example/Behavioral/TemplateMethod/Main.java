package org.example.Behavioral.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        BaseHeroCreator baseHeroCreator = new AxeCreator();
        baseHeroCreator.create();

        System.out.println("==========================================");

        BaseHeroCreator baseHeroCreator2 = new TidehunterCreator();
        baseHeroCreator2.create();
    }
}
