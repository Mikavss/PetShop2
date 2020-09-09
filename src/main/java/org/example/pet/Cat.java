package org.example.pet;

public class Cat extends Animal {
    public Cat(String name, int age, double price) {
        super(name, age, price);
    }

    @Override
    public void voice() {
        System.out.println("Myaaaaauuuu");
    }

    public void voice(byte foodCan) {
        if (foodCan < 2) {
            System.out.println("Myaaaaauuuu");
        } else {
            System.out.println("...........");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
