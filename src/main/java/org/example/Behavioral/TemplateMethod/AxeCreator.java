package org.example.Behavioral.TemplateMethod;

public class AxeCreator extends BaseHeroCreator{

    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading Hero files...");
        return new byte[0];
    }

    @Override
    public void createHeroModel(byte[] data) {
        System.out.println("Creating Axe model...");

    }

    @Override
    public void downloadSkins() {
        System.out.println("Downloading your personal Hero skin");
    }

    @Override
    public void addingSkills() {
        System.out.println("Adding skills for Axe hero");
    }
}
