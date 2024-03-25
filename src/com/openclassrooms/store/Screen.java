package com.openclassrooms.store;

public class Screen extends Item {

    private String resolution;

    public Screen(String brand, double price, String resolution) {
        super(brand, price);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }
}