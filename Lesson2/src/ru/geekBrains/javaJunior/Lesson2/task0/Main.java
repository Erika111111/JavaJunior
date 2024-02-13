package ru.geekBrains.javaJunior.Lesson2.task0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> car = Class.forName("Car");
        // с помощью класса Constructor получаем все конструкторы класса car
        Constructor<?>[] constructors = car.getConstructors();

       Object gaz = constructors[0].newInstance("GAZ");
        System.out.println(gaz);

        Field[] fields = gaz.getClass().getFields();
        int tmp = fields[fields.length - 1].getInt(gaz);
        fields[fields.length -1].setInt(gaz, tmp * 2);
        System.out.println(gaz);
    }
}