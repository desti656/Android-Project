package com.example.keludapplication;

public class Collection {
    private String collection_name;
    private int restaurant_count, restaurant_image;

    public Collection(String collection_name, int restaurant_count, int restaurant_image) {
        this.collection_name = collection_name;
        this.restaurant_count = restaurant_count;
        this.restaurant_image = restaurant_image;
    }

    public String getCollection_name() {
        return collection_name;
    }

    public void setCollection_name(String collection_name) {
        this.collection_name = collection_name;
    }

    public int getRestaurant_count() {
        return restaurant_count;
    }

    public void setRestaurant_count(int restaurant_count) {
        this.restaurant_count = restaurant_count;
    }

    public int getRestaurant_image() {
        return restaurant_image;
    }

    public void setRestaurant_image(int restaurant_image) {
        this.restaurant_image = restaurant_image;
    }
}
