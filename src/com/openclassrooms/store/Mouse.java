package com.openclassrooms.store;

public class Mouse extends Item {

    // METHODES -----------------
    public Mouse(Brand brand, double price) {
        super(brand, price);
        System.out.println("L'objet Mouse et sa méthode super ont été déclenchés");
        System.out.println("La Mouse est de marque : " + brand);
        System.out.println("La Mouse coute : " + price);
    }

}
