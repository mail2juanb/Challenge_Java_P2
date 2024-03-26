package com.openclassrooms.store;

public class Screen extends Item {

    // VARIABLES -----------------
    private final String resolution;

    // METHODES -----------------
    public Screen(Brand brand, double price, String resolution) {
        super(brand, price);
        this.resolution = resolution;
        System.out.println("L'objet Screen et sa méthode super ont été déclenchés");
        System.out.println("Le Screen est de marque : " + brand);
        System.out.println("Le Screen coute : " + price);
        System.out.println("Le Screen à une résolution de : " + resolution);
    }

    public String getResolution() {
        System.out.println("La méthode getResolution a été déclenchée");
        return resolution;
    }
}