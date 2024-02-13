package ru.geekBrains.javaJunior.Lesson2.HW2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
Создайте абстрактный класс "Animal" с полями "name" и "age".
Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
Выведите на экран информацию о каждом объекте.
Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        Animal[] animals1 = new Animal[2];
        animals1[0] = new Cat("Mysya", 15, "grey");
        animals1[1] = new Dog("Charik", 5, 50);

        Class<?> animals = Class.forName("ru.geekBrains.javaJunior.Lesson2.HW2.Animal");
        Class<?> cat = Class.forName("ru.geekBrains.javaJunior.Lesson2.HW2.Cat");
        Class<?> dog = Class.forName("ru.geekBrains.javaJunior.Lesson2.HW2.Dog");
        Field[]fields = animals.getDeclaredFields();
        for (Field field:fields) {
            System.out.println(field);
        }


        Constructor<?>[] constructors = animals.getConstructors();
        Constructor<?>[] constructorsCat = cat.getConstructors();
        Constructor<?>[] constructorsDog = dog.getConstructors();
        Object[] animalsInstance = new Object[]{constructorsCat[0].newInstance("Basya", 3, "black"), constructorsDog[0].newInstance("Udi", 2, 30)};

        Method makeSound = animals.getDeclaredMethod("makeSound");
        Arrays.stream(animalsInstance).forEach(a -> {
            try {
                makeSound.invoke(a);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });

    }
}
