package com.Afifah.pbo.modul5.percobaan;

public class Sekolah {

    public static void main(String[] args) {
        // CONSTRUCTOR KELAS
        Kelas kelasA = new Kelas(101, "Kelas 101");
        Kelas kelasB = new Kelas(102, "Kelas 102");
        Kelas kelasC = new Kelas(103, "Kelas 103");

        // CONSTRUCTOR MAHASISWA
        Mahasiswa mhsA = new Mahasiswa();
        Mahasiswa mhsB = new Mahasiswa("Pyra");
        Mahasiswa mhsC = new Mahasiswa(101010,"Mythra");

        // ASSIGN MAHASISWA TO KELAS
        kelasA.setMahasiswa(mhsA);
        kelasB.setMahasiswa(mhsB);
        kelasC.setMahasiswa(mhsC);

        //OUTPUT KELAS A
        System.out.println(kelasA.getNamaKelas());
        System.out.println("Kode Kelas: " + kelasA.getKodeKelas());
        System.out.println("Mahasiswa : " + kelasA.getMahasiswa());
        System.out.println();

        //OUTPUT KELAS B
        System.out.println(kelasB.getNamaKelas());
        System.out.println("Kode Kelas: " + kelasB.getKodeKelas());
        System.out.println("Mahasiswa : " + kelasB.getMahasiswa());
        System.out.println();

        // OUTPUT KELAS C
        System.out.println(kelasC.getNamaKelas());
        System.out.println("Kode Kelas: " + kelasC.getKodeKelas());
        System.out.println("Mahasiswa : " + kelasC.getMahasiswa());
        System.out.println();
    }
}
