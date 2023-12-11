package org.example.Behavioral.TemplateMethod;

public class TidehunterCreator extends BaseHeroCreator {

    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading Hero files...");
        return new byte[0];
    }

    @Override
    public void createHeroModel(byte[] data) {
        System.out.println("Creating Tidehunter model...");

    }

    @Override
    public void downloadSkins() {
        System.out.println("Downloading your personal Immortal skin for Tide");
    }

    @Override
    public void addingSkills() {
        System.out.println("Adding skills for Tidehunter hero");
    }
}
