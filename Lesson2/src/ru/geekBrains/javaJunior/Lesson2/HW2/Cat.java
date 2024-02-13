package ru.geekBrains.javaJunior.Lesson2.HW2;

public class Cat extends Animal{
    private String color;


    public Cat(String name, int age,String color) {
        super(name, age);
        this.color = color;
    }
    @Override
    void makeSound() {
        System.out.println("Мяу");
    }
    /*
    Способность царапаться
     */
    private boolean isScratch(){
        return true;
    }
}
