package com.reflections.access_private_field_02;
import java.lang.reflect.*;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person person = new Person(25);

        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true); // Allow access to private field

        // Get the private field value
        int age = (int) ageField.get(person);
        System.out.println("Original Age: " + age);

        // Modify the private field value
        ageField.set(person, 30);
        System.out.println("Updated Age: " + ageField.get(person));
    }
}

