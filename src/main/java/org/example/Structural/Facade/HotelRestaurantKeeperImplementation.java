package org.example.Structural.Facade;

public class HotelRestaurantKeeperImplementation implements HotelRestaurantKeeper {

    public String getVegMenu()
    {
        VegRestaurant v = new VegRestaurant();
        return v.getMenus();
    }

    public String getNonVegMenu()
    {
        NonVegRestaurant v = new NonVegRestaurant();
        return v.getMenus();
    }

    public String getVegNonMenu()
    {
        VegRestaurant v1 = new VegRestaurant();
        NonVegRestaurant v2 = new NonVegRestaurant();
        return v1.getMenus() + v2.getMenus();
    }
}
