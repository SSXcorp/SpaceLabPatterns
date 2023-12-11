package org.example.Creational.Builder;

public class AmericanBurgerBuilder implements BurgerBuilder{

    private Burger burger;

    public AmericanBurgerBuilder() {
        this.burger = new Burger();
    }

    @Override
    public void buildBurgerBun() {
        burger.setBurgerBun("American bun");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("Mozzarella");
    }

    @Override
    public void buildMeat() {
        burger.setMeat("Chicken");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Hot chili");
    }

    @Override
    public Burger getBurger() {
        return this.burger;
    }
}
