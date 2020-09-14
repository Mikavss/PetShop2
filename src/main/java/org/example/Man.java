package org.example;

import lombok.*;
import org.example.pet.Animal;

@Getter
@Setter

public class Man {
    private final String name;
    private final int age;
    private double money;
    private Animal pet;

    public Man(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    @Override
    public String toString() {
        return "В магазине " + name +
                ", ему " + age + " года" +
                ", с собой у него " + money + " рублей" +
                ", животное: " + pet;
    }

}
