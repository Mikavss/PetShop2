package org.example.pet;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
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
}
