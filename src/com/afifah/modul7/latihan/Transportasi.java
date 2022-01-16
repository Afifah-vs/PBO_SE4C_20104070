package com.Afifah.modul7.latihan;

public class Transportasi {
    private String nama;
    private int roda;

    public Transportasi() {
        this.nama = "Bus";
        System.out.println(this.getNama() + " adalah tranportasi darat");
    }

    public Transportasi(String nama) {
        this.nama = nama;
        System.out.println(this.getNama() + " adalah transportasi darat");
    }

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public void roda() {
        System.out.println(this.getNama() + " memiliki roda");
    }

    public void jumlahRoda() {}
}


