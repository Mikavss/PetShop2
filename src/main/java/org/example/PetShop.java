package org.example;

import org.example.pet.Animal;
import org.example.pet.Cat;
import org.example.pet.Dog;

public class PetShop {
    private final Animal dog = new Dog("Rex", 4);
    private final Animal cat = new Cat("Murzik", 2);

    public PetShop() {
        System.out.println("Welcome to 'PetShop'");
        System.out.println("We have one cat and one dog");
    }

    public Animal getAnimal(String animalType) {
        switch (animalType) {
            case "cat":
                return cat;
            case "dog":
                return dog;
            default:
                throw new IllegalArgumentException("unknown type of animal");
        }
    }
}
