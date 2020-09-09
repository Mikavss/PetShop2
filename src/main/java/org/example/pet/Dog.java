package org.example.pet;

public class Dog extends Animal {

    public Dog(String name, int age, double price) {
        super(name, age, price);
    }

    @Override
    public void voice() {
        System.out.println("Wav wav!!");
    }

    public void voice(byte foodCan) {
        if (foodCan < 5) {
            System.out.println("Wav wav!!");
        } else {
            System.out.println("...........");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
