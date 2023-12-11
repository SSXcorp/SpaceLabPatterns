package org.example.Structural.Facade;

public class VegRestaurant implements HotelRestaurant {

    public String getMenus()
    {
        return "Menu from Veg Restaurant : Some menu.";
    }
}