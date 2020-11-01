package com.pboreg;

import java.util.*;

class Orang{

    private String nama;


    public void setNama(String nama){

        this.nama = nama;
    }

    public String getNama (){

        return this.nama   ;
    }

}

class Pegawai extends Orang {
    String nip;
    String jabatan;
    int golongan;
    int jamKerja;


    public int getGolongan() {

        return golongan;
    }

    public void setGolongan(int golongan) {

        this.golongan = golongan;
    }

    public int getJamKerja() {

        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {

        this.jamKerja = jamKerja;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {

        this.nip = nip;
    }

    public String getJabatan() {

        return jabatan;
    }

    public void setJabatan(String jabatan) {

        this.jabatan = jabatan;
    }
    public static double pajakGaji(double x, int y){
        return x / y;
    }

    void gaji() {
        int gajiPokok = 0;
        int tunjangan = 0;
        int gajiLembur;

        int totalGaji;
        int lembur;
        double gajiBersih;
        double tax;

        if (golongan == 1) {
            gajiPokok = 1486500;
            tunjangan = 250000;
        }
        if (golongan == 2) {
            gajiPokok = 1926000;
            tunjangan = 300000;
        }
        if (golongan == 3) {
            gajiPokok = 2456700;
            tunjangan = 350000;
        }
        if (golongan == 4) {
            gajiPokok = 2899500;
            tunjangan = 400000;
        }
        if (jamKerja <= 172) {
            lembur = 0;
            System.out.println("====Maaf Jam lembur tidak ada maka tidak ada uang lembur====");
        }
        else {
            lembur = jamKerja - 173;
        }

        gajiLembur = lembur * 20000;
        totalGaji = gajiPokok + tunjangan;
        System.out.println("Gaji Pokok = Rp." + gajiPokok);
        System.out.println("Tunjangan = Rp." + tunjangan);
        System.out.println("Gaji Lembur = Rp." + gajiLembur);
        double pajak = pajakGaji(0.5, 100)*totalGaji;
        tax = totalGaji - pajak;
        gajiBersih = tax + gajiLembur;

        System.out.println("=====================================");
        System.out.println("Total Gaji sebelum uang lembur dan pajak 0.5% = RP." + totalGaji );
        System.out.println("Total Gaji sesudah termasuk pajak 0.5% = RP." + tax);
        System.out.println("Total Gaji Bersih = RP." + gajiBersih);

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pegawai pgw = new Pegawai();

        int jamKerja;
        int golongan;
        String nama;
        String nip;
        String jabatan;

        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("NIP : ");
        nip = input.nextLine();
        System.out.print("Jabatan : ");
        jabatan = input.nextLine();
        System.out.print("Jam kerja : ");
        jamKerja = input.nextInt();
        System.out.print("Golongan Pekerja : ");
        golongan = input.nextInt();

        System.out.println("================ Data Pegawai ================");

        pgw.setNama(nama);
        pgw.setNip(nip);
        pgw.setJabatan(jabatan);
        pgw.setJamKerja(jamKerja);
        pgw.setGolongan(golongan);

        System.out.println("Nama : " + pgw.getNama());
        System.out.println("NIP : " + pgw.getNip());
        System.out.println("Jabatan : " + pgw.getJabatan());
        System.out.println("Jam Kerja : " + pgw.getJamKerja());
        System.out.println("Golongan : " + pgw.getGolongan());
        System.out.println("================ GOLONGAN " + golongan + " ================");
        pgw.gaji();

    }

}
