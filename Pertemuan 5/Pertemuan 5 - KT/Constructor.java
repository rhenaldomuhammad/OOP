package com.pboreg;

// class dengan constructor
class Mahasiswa1{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat
    Mahasiswa1(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Mahasiswa1 mahasiswa1 = new Mahasiswa1("Rhenaldo","2019071039","Informatika");
        System.out.println("\n");
        Mahasiswa1 mahasiswa2 = new Mahasiswa1("Mulberth","202114004","Teknik Pertanian");

    }
}
