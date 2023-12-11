package org.example.Structural.Facade;

public class NonVegRestaurant implements HotelRestaurant {

    public String getMenus()
    {
        return "Menu from NonVeg Restaurant : Some menu.";
    }
}