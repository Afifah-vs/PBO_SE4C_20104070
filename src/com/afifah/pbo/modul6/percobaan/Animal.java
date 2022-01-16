package com.afifah.pbo.modul6.percobaan;

public class Animal {

    // ATTRIBUTE
    public String name = "Unnamed Animal";
    public int age = 0;

    // CONSTRUCTOR
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // METHOD
    public void walk() {
        System.out.println(this.name + " walks!");
        System.out.println();
    }
}

