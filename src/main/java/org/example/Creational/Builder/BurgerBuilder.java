package org.example.Creational.Builder;

public interface BurgerBuilder {

    public void buildBurgerBun();

    public void buildCheese();

    public void buildMeat();

    public void buildSauce();

    public Burger getBurger();
}
