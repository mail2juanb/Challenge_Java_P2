package com.openclassrooms;

import com.openclassrooms.store.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("  =====  DEBUT DE PROGRAMME  =====  ");
        System.out.println("  ");

        System.out.println("Création des objets nécessaires......");
        System.out.println("  ");

        System.out.println("Création d'une Mouse nommée dellMouse");
        Mouse dellMouse = new Mouse(Brand.DELL, 20.0);
        System.out.println("  ");

        System.out.println("Création d'un Screen nommée samsungScreen");
        Screen samsungScreen = new Screen(Brand.SAMSUNG, 150.0, "1920x1080");
        System.out.println("  ");

        System.out.println("Création d'une Mouse nommée appleMouse");
        Mouse appleMouse = new Mouse(Brand.APPLE, 1200.0);
        System.out.println("  ");

        System.out.println("  ");
        System.out.println("Il faut maintenant créer l'inventaire......");
        Inventory inventory = new Inventory();

        System.out.println("  ");
        System.out.println("Ajout de 12 Items dellMouse à l'inventaire");
        inventory.addItem(dellMouse, 12);

        System.out.println("  ");
        System.out.println("Ajout de 5 Items samsungScreen à l'inventaire");
        inventory.addItem(samsungScreen, 5);

        System.out.println("  ");
        System.out.println("Affichage de l'inventaire complet dans la console");
        inventory.displayInventoryOnConsole();

        System.out.println("  ");
        System.out.println("Suppression de 2 Items dellMouse");
        inventory.removeItem(dellMouse, 2);

        System.out.println("  ");
        System.out.println("Ajout de 1 Item appleMouse à l'inventaire");
        inventory.addItem(appleMouse, 1);

        System.out.println("  ");
        System.out.println("Ajout de 2 Items samsungScreen à l'inventaire");
        inventory.addItem(samsungScreen, 2);

        System.out.println("  ");
        System.out.println("Affichage de l'inventaire complet dans la console");
        inventory.displayInventoryOnConsole();

        System.out.println("  ");
        System.out.println("Suppression de 12 Items dellMouse");
        inventory.removeItem(dellMouse, 12);

        System.out.println("  ");
        System.out.println("Affichage de l'inventaire complet dans la console");
        inventory.displayInventoryOnConsole();

        System.out.println("  ");
        System.out.println("Affichage des Items dans la console");
        inventory.displayItemsOnConsole();

        System.out.println("  ");
        System.out.println("  =====  FIN DU PROGRAMME  =====  ");
    }
}
