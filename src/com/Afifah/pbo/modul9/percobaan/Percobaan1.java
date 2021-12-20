package com.Afifah.pbo.modul9.percobaan;

public class Percobaan1 {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            a[5] = 100;
            System.out.println("Nilai array a[5] = " + a[5]);
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks Array melebihi batas!");
        }
    }
}
