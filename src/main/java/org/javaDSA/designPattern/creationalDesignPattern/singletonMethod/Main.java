package org.javaDSA.designPattern.creationalDesignPattern.singletonMethod;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Create the first instance of SingletonClass
        SingletonClass singleton1 = SingletonClass.getInstance("First Instance");
        System.out.println("Singleton 1 Value: " + singleton1.value);

        // Create the second instance of SingletonClass
        SingletonClass singleton2 = SingletonClass.getInstance("Second Instance");
        System.out.println("Singleton 2 Value: " + singleton2.value);

        // Verify that both instances are the same
        System.out.println("Are both instances equal? " + (Objects.equals(singleton1.value, singleton2.value)));
    }
}
