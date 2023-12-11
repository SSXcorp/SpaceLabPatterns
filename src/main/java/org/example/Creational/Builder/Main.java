package org.example.Creational.Builder;

public class Main {
    public static void main(String[] args) {
        BurgerBuilder americanBurgerBuilder = new AmericanBurgerBuilder();
        BurgerMaker burgerMaker = new BurgerMaker(americanBurgerBuilder);
        burgerMaker.makeBurger();
        Burger burger1 = burgerMaker.getBurger();

        System.out.println("American burger variant created with ingredients : " + burger1.bun + ", " + burger1.cheese + ", "
                + burger1.meat + ", " + burger1.sauce + " !" + burger1.toString());

        BurgerBuilder classicBurgerBuilder = new ClassicBurgerBuilder();
        BurgerMaker burgerMaker2 = new BurgerMaker(classicBurgerBuilder);
        burgerMaker2.makeBurger();
        Burger burger2 = burgerMaker2.getBurger();

        System.out.println("Classic burger variant created with ingredients : " + burger2.bun + ", " + burger2.cheese + ", "
                + burger2.meat + ", " + burger2.sauce + " !" + burger2.toString());



    }
}
