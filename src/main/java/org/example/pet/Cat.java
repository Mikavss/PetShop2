package org.example.pet;

public class Cat extends Animal {
    public Cat(String name, int age, double price) {

        super(name, age, price);
    }

    @Override
    public void voice() {
        System.out.println("Мяяяяяяяяяяу");
    }

    public void voice(byte foodCan) {
        if (foodCan < 2) {
            System.out.println("Мяяяяяяяяяяяяу");
        } else {
            System.out.println("...........");
        }
    }

    @Override
    public String toString() {
        return "Кот, " +
                "имя: " + name +
                ", возраст: " + age +
                ", цена: " + price;
    }
}
