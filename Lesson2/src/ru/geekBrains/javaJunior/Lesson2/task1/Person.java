package ru.geekBrains.javaJunior.Lesson2.task1;

public class Person {
    private String name;
    private int age;

    public Person() {
        name = "name";
        age = 25;
    }
    private void displayInfo(){
        System.out.printf(name, age);
    }
}
