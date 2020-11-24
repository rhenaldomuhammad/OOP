package com.pboreg;

import java.util.*;

class progArray {
    private int [] angka;
    public progArray(int count){
        angka = new int [count];
    }

    public void setAngka() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Data");
        for(int i=0; i < this.angka.length; i++){
            System.out.print("Nilai " + (i+1) + "= ");
            this.angka[i] = sc.nextInt();
        }
    }

    public void viewArray(){
        System.out.println("\n-------Tampilan Data yang Telah di Input-------");
        for(int i=0; i < this.angka.length; i++){
            System.out.println("Nilai " + (i+1) + "= " +
                    this.angka[i]);
        }
    }

    public void cariAngka(int cariArray){
        for (int i =0;i<this.angka.length;i++){
            if (angka[i]==cariArray){
                System.out.println("Data " + cariArray + " Ditemukan di list ke-"+(i+1)+", indeks ke "+i);
                return;
            }
        }
        System.out.println("Data (" + cariArray + ") Ini Tidak Ditemukan");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;
        int cari;
        System.out.print("\nInput Jumlah Array : ");
        total=sc.nextInt();
        progArray arr = new progArray(total);
        arr.setAngka();
        arr.viewArray();
        System.out.print("\nInput Angka yang ingin dicari :  ");
        cari=sc.nextInt();
        arr.cariAngka(cari);
    }
}
