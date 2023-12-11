package org.example.Creational.Builder;

public class ClassicBurgerBuilder implements BurgerBuilder {

    private Burger burger;

    public ClassicBurgerBuilder() {
        this.burger = new Burger();
    }

    @Override
    public void buildBurgerBun() {
        burger.setBurgerBun("Default bun");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("Cheddar");
    }

    @Override
    public void buildMeat() {
        burger.setMeat("Beef");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Ketchup");
    }

    @Override
    public Burger getBurger() {
        return this.burger;
    }
}
