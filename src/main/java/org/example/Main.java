package org.example;

import org.example.pet.Animal;

import static org.example.pet.AnimalType.CAT;
import static org.example.pet.AnimalType.DOG;

public class Main {
    public static void main(String[] args) {
        PetShop shop = new PetShop();

        double money = (int) (Math.random() * 100);
        Man man = new Man("Джон", 42, money);

        Animal cat = shop.getAnimal(CAT);
        Animal dog = shop.getAnimal(DOG);

        System.out.println(man);

        shop.sell(man, dog);

        System.out.println(man);

        if (cat == null)
            System.out.println("В магазине осталось котов: " + shop.getAnimal(CAT));
        else
            System.out.println("В магазине осталось собак: " + shop.getAnimal(DOG));

    }
}
