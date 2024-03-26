package com.openclassrooms.store;

/**
 * TO DO Mettre la class en Interface ?
 */
abstract public class Item {

    // VARIABLES -----------------
    protected Brand brand;
    protected double price;

    // METHODES -----------------
    protected Item(Brand brand, double price) {
        System.out.println("L'objet Item a été déclenché");
        this.brand = brand;
        this.price = price;

    }

    public Brand getBrand() {
        System.out.println("La méthode getBrand a été déclenchée");
        return this.brand;
    }

    /*
    public void setBrand(String brand) {
    	this.brand = brand;
    }
    */

    public double getPrice() {
        System.out.println("La méthode getPrice a été déclenchée");
        return price;
    }

}