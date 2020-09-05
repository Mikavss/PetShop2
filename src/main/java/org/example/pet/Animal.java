package org.example.pet;

import java.util.Objects;

public abstract class Animal implements IVoice {
    private final String name;
    private int age;
    private double price;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
