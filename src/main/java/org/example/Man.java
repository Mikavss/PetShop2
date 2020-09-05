package org.example;

import org.example.pet.Animal;

public class Man {
    private final String name;
    private final int age;
    private Animal pet;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    public void buyPet(Animal animal) {
        this.pet = animal;
        System.out.println(name + " buy '" + animal.getName() + '\'');
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}
