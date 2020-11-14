package com.pboreg;

import java.util.Scanner;

abstract class Jumlah {
    public abstract void hasil();

}

class Segitiga extends Jumlah{
    public void hasil() {
        Scanner input = new Scanner(System.in);
        int alas, tinggi;
        double luas1;

        System.out.println("Menghitung Luas  Segitiga");
        System.out.print("Masukkan Alas : ");
        alas=input.nextInt();
        System.out.print("Masukkan Tinggi : ");
        tinggi=input.nextInt();

        luas1 = 0.5*alas*tinggi;
        System.out.println("Hasil dari Luas Segitiga = " + luas1 + " Cm2");
    }
}
class Lingkaran extends Jumlah{
    public void hasil() {
        Scanner input = new Scanner(System.in);
        double luas2, phi = 3.14;
        int r=5;
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Masukkan Jari Jari : ");
        r=input.nextInt();
        luas2 =  phi*r*r;
        System.out.println("Hasil dari Luas Lingkaran = " + luas2 + " Cm2");
    }
}

public class Hitung {
    public static void main(String[] args) {
        Segitiga jumlahSeg = new Segitiga();
        jumlahSeg.hasil();
        Lingkaran jumlahLin = new Lingkaran();
        jumlahLin.hasil();

    }
}
