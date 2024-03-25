package com.openclassrooms.store;

public class Item {

    protected String brand;
    protected double price;

    protected Item(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    /*
    public void setBrand(String brand) {
    	this.brand = brand;
    }
    */

    public double getPrice() {
        return price;
    }

}