package org.example;

import org.example.pet.Animal;

public class Main {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        Man man = new Man("John", 42);

        Animal cat = shop.getAnimal("cat");
        Animal dog = shop.getAnimal("dog");

        man.buyPet(cat);
        System.out.println(man);
    }
}
