package com.Afifah.pbo.modul3.latihan;

public class Tabungan {

    // Attribute
    public int saldo;

    // Constructor method
    public Tabungan (int saldo){
        this.saldo = saldo;
    }

    // Method
    public int getSaldo(){
        return saldo;
    }

    public void simpanUang(int jumlah){
        saldo = saldo + jumlah;
    }

    public boolean ambilUang(int jumlah){
        saldo = saldo - jumlah;
        return true;
    }



}
