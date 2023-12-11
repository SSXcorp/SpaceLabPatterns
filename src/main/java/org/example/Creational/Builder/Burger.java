package org.example.Creational.Builder;

public class Burger implements BurgerRecipe{

    String bun;
    String cheese;
    String meat;
    String sauce;

    public void setBurgerBun(String bun) {
        this.bun = bun;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }


}
