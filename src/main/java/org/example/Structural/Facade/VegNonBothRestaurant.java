package org.example.Structural.Facade;

public class VegNonBothRestaurant implements HotelRestaurant {

    VegRestaurant vegRestaurant;
    NonVegRestaurant nonVegRestaurant;

    public String getMenus()
    {
        return vegRestaurant.getMenus() + " " + nonVegRestaurant.getMenus();
    }
}
