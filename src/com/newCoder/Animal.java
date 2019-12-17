package com.newCoder;

public class Animal implements Talking{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Animal Say");
    }
}
