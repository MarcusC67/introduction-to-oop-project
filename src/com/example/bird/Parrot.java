package com.example.bird;

public class Parrot extends Bird {

    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Allo cocky! I'm " + name + " and I'm a " + color + " parrot.");
    }

}