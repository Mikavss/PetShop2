package org.example;

import org.example.pet.*;

public class PetShop {
    private Animal dog = new Dog("Рекс", 4, 15);
    private Animal cat = new Cat("Мурзик", 2, 20);

    public PetShop() {
        System.out.println("Добро пожаловать в магазин животных!");
        System.out.println("У нас есть одна собака и один кот");
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
                if (man.getMoney() > dog.getPrice()) {
                    System.err.println("Обратите внимание, " + man.getName() + ", у вас хватит денег на покупку Собаки!");
                }
            } else if (pet instanceof Dog) {
                dog = null;
                if (man.getMoney() > cat.getPrice()) {
                    System.err.println("Обратите внимание, " + man.getName() + ", у вас хватит денег на покупку Кота!");
                }
            }

            System.out.println(man.getName() + " купил:  " + pet);
        } else {
            System.err.println("Простите, " + man.getName() + " у вас не хватает " + (pet.getPrice() - man.getMoney()) + " рублей");
        }
    }
}
