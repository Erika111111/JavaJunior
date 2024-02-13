package ru.geekBrains.javaJunior.Lesson2.HW2;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
}
