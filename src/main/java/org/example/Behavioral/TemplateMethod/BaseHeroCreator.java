package org.example.Behavioral.TemplateMethod;

public abstract class BaseHeroCreator {

    public void create() {
        byte[] data = loadLocalData();
        createHeroModel(data);
        downloadSkins();
        addingSkills();
        cleanTempFiles();
    }

    abstract byte[] loadLocalData();

    abstract void createHeroModel(byte[] data);

    abstract void downloadSkins();

    abstract void addingSkills();

    protected void cleanTempFiles() {
        System.out.println("Cleaning temporary files...");
    }

}
