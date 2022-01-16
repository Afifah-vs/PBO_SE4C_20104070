package com.afifah.pbo.modul6.percobaan;

public class Bird extends Animal{

    // CONSTRUCTOR
    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    // METHOD
    public void fly() {
        System.out.println(this.name + " flies!");
        System.out.println();
    }
}
