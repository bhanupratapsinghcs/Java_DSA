package org.javaDSA.designPattern.creationalDesignPattern.singletonMethod;

public class SingletonClass {
    private static SingletonClass instance;
    public String value;
    private SingletonClass(String value) {
        // private constructor to prevent instantiation
        this.value = value;
    }
    public static synchronized SingletonClass getInstance(String value) {
        if(instance == null){
            instance = new SingletonClass(value);
        }
        return instance;
    }
}
