package org.example.pet;

public class Dog extends Animal {

    public Dog(String name, int age, double price) {
        super(name, age, price);
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
    }

    public void voice(byte foodCan) {
        if (foodCan < 5) {
            System.out.println("Гав!");
        } else {
            System.out.println("...........");
        }
    }

    @Override
    public String toString() {
        return "Собака, имя: " + name +
                ", возраст: " + age +
                ", цена: " + price;
    }
}
