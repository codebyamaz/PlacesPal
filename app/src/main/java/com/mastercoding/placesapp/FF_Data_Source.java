package com.mastercoding.placesapp;

public class FF_Data_Source {

    // Data Source
    private String restaurantName, restaurantRating;
    private int restaurantImage;

    public FF_Data_Source(String restaurantName, String restaurantRating, int restaurantImage) {
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.restaurantImage = restaurantImage;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantRating() {
        return restaurantRating;
    }

    public int getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setRestaurantRating(String restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public void setRestaurantImage(int restaurantImage) {
        this.restaurantImage = restaurantImage;
    }
}