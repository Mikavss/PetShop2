package org.example;

import org.example.pet.Animal;

import static org.example.pet.AnimalType.CAT;
import static org.example.pet.AnimalType.DOG;

public class Main {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        Man man = new Man("John", 42, 150d);

        Animal cat = shop.getAnimal(CAT);
        Animal dog = shop.getAnimal(DOG);

        System.out.println(man);

        shop.sell(man, cat);

        System.out.println(man);
        System.out.println(shop.getAnimal(CAT));
    }
}
