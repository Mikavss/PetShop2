package org.example;

import org.example.pet.Animal;
import org.example.pet.AnimalType;
import org.example.pet.Cat;
import org.example.pet.Dog;

import static org.example.pet.AnimalType.CAT;

public class PetShop {
    private Animal dog = new Dog("Rex", 4, 50);
    private Animal cat = new Cat("Murzik", 2, 100);

    public PetShop() {
        System.out.println("Welcome to 'PetShop'");
        System.out.println("We have one cat and one dog");
    }

    public Animal getAnimal(AnimalType type) {
        switch (type) {
            case CAT:
                return cat;
            case DOG:
                return dog;
            default:
                throw new IllegalArgumentException("unknown type of animal");
        }
    }

    public void sell(Man man, Animal pet) {
        if (man.getMoney() > pet.getPrice()) {
            man.setMoney(man.getMoney() - pet.getPrice());
            man.setPet(pet);
            if (pet instanceof Cat) {
                cat = null;
            } else if (pet instanceof Dog) {
                dog = null;
            }
            System.out.println(man.getName() + " buy pet - " + pet);
        } else {
            System.out.println("Sorry, but " + man.getName() + " has not enough money");
        }
    }
}
