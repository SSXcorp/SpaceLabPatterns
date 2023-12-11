package org.example.Creational.Builder;

public class BurgerMaker {
    private BurgerBuilder burgerBuilder;

    public BurgerMaker(BurgerBuilder burgerBuilder)
    {
        this.burgerBuilder = burgerBuilder;
    }

    public Burger getBurger() {
        return this.burgerBuilder.getBurger();
    }

    public void makeBurger()
    {
        this.burgerBuilder.buildBurgerBun();
        this.burgerBuilder.buildCheese();
        this.burgerBuilder.buildMeat();
        this.burgerBuilder.buildSauce();

    }
}
