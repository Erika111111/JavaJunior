package ru.geekBrains.javaJunior.Lesson2.task0;

public class Car {
    public String name;
    private String price;
    private String engType;
    private String engPower;
    private int maxSpeed;


    public Car(String name) {
        this.name = name;
        this.engType = "V8";
        this.engPower = "123";
        this.maxSpeed = 100;
        this.price = "1000000";
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}

