package org.example.Structural.Facade;

public class Main {
    public static void main(String[] args) {
        HotelRestaurantKeeper hotelRestaurantKeeper = new HotelRestaurantKeeperImplementation();
        System.out.println(hotelRestaurantKeeper.getVegMenu());
        System.out.println(hotelRestaurantKeeper.getNonVegMenu());
        System.out.println(hotelRestaurantKeeper.getVegNonMenu());
    }
}
