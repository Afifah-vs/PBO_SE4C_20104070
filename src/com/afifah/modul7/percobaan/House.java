package com.Afifah.modul7.percobaan;

public class House {
    public static void main(String[] args) {
        TV tv = new TV("TV");
        AC ac = new AC("AC");
        Electonics lamp = new Electonics("Lamp");
        Electonics device = new Electonics();
        System.out.println(" ");

        tv.activate();
        ac.activate();
        lamp.activate();
        device.activate();
        System.out.println();

        device.deactivate();
        lamp.deactivate();
        ac.deactivate();
        tv.deactivate();
        System.out.println();
    }
}


