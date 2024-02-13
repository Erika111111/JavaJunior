package ru.geekBrains.javaJunior.Lesson2.task1;

import java.lang.reflect.*;

/*
Получите информацию о классе "Person" с использованием Reflection API;
выведите на экран все поля и методы класса;
создайте экземпляр класса "Person" с использованием Reflection API;
 установите значение поля и вызовите методы;
 Ревлизуйте обработку исключений для обеспечения корректного взаимодействия с Reflection API.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {


        // варианты инициализации класса Person
        Class<?>personClass1 = Person.class;
        Class<?> personClass = Class.forName("ru.geekBrains.javaJunior.Lesson2.task1.Person");

        // получить список всех полей
        Field[]fields = personClass.getDeclaredFields();
        for (Field field:fields) {
            System.out.println(field.getName());
        }

        Constructor[] constructors = personClass.getConstructors(); // вызов конструктора
        Object personInstance = constructors[0].newInstance( null);

        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true); // разрешает доступ к закрытому полю
        nameField.set(personInstance, "Elena");

        Method displayInfoMethod =  personClass.getDeclaredMethod("displayInfo");
        displayInfoMethod.invoke(personInstance);

    }
}
