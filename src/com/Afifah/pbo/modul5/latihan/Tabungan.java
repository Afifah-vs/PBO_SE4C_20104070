package com.Afifah.pbo.modul5.latihan;

public class Tabungan {

    // Attribute
    private int saldo;

    //Constructor method
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public boolean ambilUang (int jumlah){
        if ((saldo-jumlah)<0)
            return false;
        else {
            saldo -= jumlah;
            return true;
        }
    }

    public void simpanUang(int jumlah){

        saldo += jumlah;
    }

}
