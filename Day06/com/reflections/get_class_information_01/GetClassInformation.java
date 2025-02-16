package com.reflections.get_class_information_01;
import java.lang.reflect.*;


//GetClassInformation --> This class is created for the extracting the info about the class.
public class GetClassInformation {

    //Main method to create reflect and calling method to get the info about class.
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "java.util.ArrayList";
        Class<?> clazz = Class.forName(className);

        System.out.println("Class Name: " + clazz.getName());

        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor);
        }

        System.out.println("\nMethods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }

        System.out.println("\nFields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field);
        }
    }
}

