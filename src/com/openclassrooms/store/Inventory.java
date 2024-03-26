package com.openclassrooms.store;

import java.util.HashMap;
import java.util.Map;


public class Inventory {

    protected Map<Item, Integer> inventoryMap = new HashMap<Item, Integer>();

    public void addItem(Item item, Integer quantity) {
        System.out.println("La méthode addItem a été déclenchée");
        System.out.println("L'argument item est : " + item);
        System.out.println("L'argument item est de marque : " + item.brand);
        System.out.println("L'argument quantity est : " + quantity);

        int newQuantity;
        if (inventoryMap.get(item) != null) {
            int quantityInventory = inventoryMap.get(item);
            System.out.println("Dans l'inventaire il y a " + quantityInventory + " éléments de ce type");
            newQuantity = quantityInventory - quantity;
            System.out.println(quantityInventory + " - " + quantity + " = " + newQuantity);
            if (newQuantity < 0) {
                newQuantity = 0;
                System.out.println("Attention, le résultat de la nouvelle quantité est négatif...");
            }
        } else {
            newQuantity = quantity;
        }
        inventoryMap.put(item, newQuantity);
    }

    public void removeItem(Item item, Integer quantity) {
        System.out.println("La méthode removeItem a été déclenchée");
        System.out.println("L'argument item est : " + item);
        System.out.println("L'argument item est de marque : " + item.brand);
        System.out.println("L'argument quantity est : " + quantity);

        int newQuantity;
        int quantityInventory = inventoryMap.get(item);
        System.out.println("Dans l'inventaire il y a " + quantityInventory + " éléments de ce type");
        newQuantity = quantityInventory - quantity;
        System.out.println(quantityInventory + " - " + quantity + " = " + newQuantity);
        if (newQuantity < 0) {
            newQuantity = 0;
            System.out.println("Attention, le résultat de la nouvelle quantité est négatif...");
        }
        inventoryMap.put(item, newQuantity);
    }


    public void displayInventoryOnConsole() {
        System.out.println("La méthode displayInventoryOnConsole a été déclenchée");
        System.out.println("La map contient " + inventoryMap.size() + " clefs");

        for(Map.Entry<Item, Integer> entry : inventoryMap.entrySet()) {
            System.out.println(entry.getClass().toString() + " -> " + entry.getKey().toString() + " -> " + entry.getValue().toString());
        }
    }

    public void displayItemsOnConsole() {
        System.out.println("La méthode displayItemsOnConsole a été déclenchée");
        System.out.println("La map contient " + inventoryMap.size() + " clefs");

        for(Map.Entry<Item, Integer> entry : inventoryMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
    }
}



