package ru.geekBrains.javaJunior.Lesson2.HW2;

public class Dog extends Animal{
    private int height;

    public Dog(String name, int age, int height) {
        super(name, age);
        this.height = height;
    }
    @Override
    void makeSound() {
        System.out.println("Гав");
    }

    private boolean isSecurity(){
        return true;
    }
}
