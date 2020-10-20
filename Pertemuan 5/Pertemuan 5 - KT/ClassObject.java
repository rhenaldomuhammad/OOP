package com.pboreg;

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class ClassObject {
    public static void main(String[] args) {

        // instansiasi atau membuat object
        //data mahasiswa pertama
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Rhenaldo";
        mahasiswa1.NIM = "2019071039";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.IPK = 3.1;
        mahasiswa1.umur = 19;


        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);


        //data mahasiswa kedua
        System.out.println("\n");
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Mulberth";
        mahasiswa2.NIM = "202114004";
        mahasiswa2.jurusan = "Teknik Pertanian";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 21;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}
