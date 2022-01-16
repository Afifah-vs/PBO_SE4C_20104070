package com.Afifah.modul7.latihan;

public class Garasi {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Mobil");
        Transportasi motor = new Transportasi("Motor");
        Transportasi bus = new Transportasi();
        System.out.println();

        mobil.roda();
        mobil.jumlahRoda();
        motor.roda();
        bus.roda();
        System.out.println();
    }
}



