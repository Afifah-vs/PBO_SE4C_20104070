package com.Afifah.pbo.modul4.percobaan;

public class Bank {
    public static void main(String[] args) {

        // Pembuatan object baru dari class Tabungan
        Tabungan saya = new Tabungan( "Barca",
                50410420,1_000_000, 12345);

        // Demonstrasi method Getter
        System.out.println("Nama        : " + saya.getNama());
        System.out.println("No Rekening : " + saya.getNoRekening());
        System.out.println("Saldo       : " + saya.getSaldo());
        System.out.println("PIN         : " + saya.getPin());
    }
}
