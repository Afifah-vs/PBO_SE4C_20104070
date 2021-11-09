package com.Afifah.pbo.modul5.percobaan;

public class Kelas {

    private int kodeKelas;
    private String namaKelas;
    private Mahasiswa mahasiswa;

    public Kelas(int kodeKelas, String namaKelas){
        this.kodeKelas = kodeKelas;
        this.namaKelas = namaKelas;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {

        this.mahasiswa = mahasiswa;
    }

    public int getKodeKelas() {

        return kodeKelas;
    }

    public String getNamaKelas() {

        return namaKelas;
    }

    public String getMahasiswa() {

        return mahasiswa.getNama();
    }
}
