package com.Afifah.pbo.modul3.percobaan;

public class TesTabungan {
    public static void main(String[] args) {


        // Construck objek 't' dari class 'Tabungan dengan nilai saldo awal sebesar 5000
        Tabungan t = new Tabungan(5000); //jika 0 nya banyak bisa menggunakan (_) = 500_000_000

        // Output nilai saldo awal
        System.out.println("Saldo awal Tabungan Anda : " + t.saldo);

        // Panggil method ambilUang()
        t.ambilUang(1500);
        /* Cara lain
        int jml = 1500;
        t.ambilUang(jml);
         */

        //Output jumlah uang yang diambil
        System.out.println("Jumlah uang yang diambil : 1500");
        /* Jika menggunakan cara lain
        System.out.println("Jumlah uang yang diambil : " + jml);
         */

        // Output sisa uang di tabungan
        System.out.println("Saldo Tabungan Anda sekarang adalah : " + t.saldo);
    }
}
