package com.Afifah.pbo.modul2.percobaan;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //Kita buat object 'input' dari class 'Scanner' terlebih dahulu
        Scanner input = new Scanner(System.in);

        //Buat 2 variable utk menampung nilai inputan nantinya
        int var_a, var_b;

        //Proses Input
        System.out.print("Masukkan nilai var var_a :");
        var_a = input.nextInt();
        System.out.print("Masukkan nilai var var_b : ");
        var_b = input.nextInt();

        // Output akhir program
        System.out.println();
        System.out.println("Variable yang terdapat dalam program : ");
        System.out.println("var_a = " + var_a);
        System.out.println("var_b = " + var_b);
    }
}
