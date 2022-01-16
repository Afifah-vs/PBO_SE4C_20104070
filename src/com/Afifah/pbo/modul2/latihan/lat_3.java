package com.Afifah.pbo.modul2.latihan;

import java.util.Scanner;

public class lat_3 {

    public static void main(String[] args) {
       // Inisiasi scanner
        Scanner input = new Scanner(System.in);

        // Variable
        int A1,B1,C1,A2,B2,C2;
        int operasi1,operasi2;

        // Input testcase
        System.out.print("Jumlah testcase : ");
        int testcase = input.nextInt();

        // Input nilai operasi 1
        System.out.print("Nilai A1 : ");
        A1 = input.nextInt();
        System.out.print("Nilai B1 : ");
        B1 = input.nextInt();
        System.out.print("Nilai C1 : ");
        C1 = input.nextInt();

        // Operasi Aritmatika operasi1
        operasi1 = A1+B1-C1;

        // Output operasi1
        System.out.println("Hasil Operasi 1 : " + operasi1);

        // Input nilai operasi 2
        System.out.print("Nilai A2 : ");
        A2 = input.nextInt();
        System.out.print("Nilai B2 : ");
        B2 = input.nextInt();
        System.out.print("Nilai C2 : ");
        C2 = input.nextInt();

        // Operasi Aritmatika operasi1
        operasi2 = A2+B2-C2;

        // Output operasi2
        System.out.println("Hasil Operasi 2 : " + operasi2);

    }
}
