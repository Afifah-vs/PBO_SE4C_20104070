package com.Afifah.modul7.latihan;

public class Mobil extends Transportasi{

    public Mobil() {}

    public Mobil(String nama) {
        super(nama);
    }

    public void jumlahRoda() {

        System.out.println(this.getNama() + " memiliki 4 roda");
    }
}



