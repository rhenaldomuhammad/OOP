package com.pboreg;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Biodata objkuy = new Biodata();
        System.out.println("========Data Diri Mahasiswa UPJ========");
        System.out.println("\n");


        System.out.println("Nama = " + objkuy.namaMahasiswa());

        Biodata objkui = new Biodata();
        System.out.println("Nomor Induk Mahasiswa = " + objkui.tambah());
        System.out.println("Jurusan = " + objkuy.tampilanf4());

        System.out.println("Tahun Angkatan = " + objkui.kurang());

        System.out.println("\n");
        System.out.println("========Data Telah Diverifikasi========");
    }
}
