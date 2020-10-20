package com.pboreg;

public class Main {
    public static void main(String[] args) {
        Classku objku = new Classku();
        System.out.println(objku.x);
        System.out.println(objku.y);
        System.out.println(objku.tampilkanZ());

        System.out.println("\n");

        Classku obil = new Classku();
        System.out.println(obil.tampilkanA());
        System.out.println(obil.tampilkanB());
        System.out.println(obil.tampilkanC());


        //input
        obil.inputA(10);
        System.out.println("nilai A setelah diinput = " + obil.tampilkanA());

        obil.inputB(20);
        System.out.println("nilai B setelah diinput = " + obil.tampilkanB());

        obil.inputC(30);
        System.out.println("nilai C setelah diinput = " + obil.tampilkanC());

        //panggil method
        System.out.println("Hasil Pertambahan = " +obil.tambah());
        System.out.println("Hasil Pengurangan = " +obil.kurang());
        System.out.println("Hasil Perkalian = " +obil.kali());
        System.out.println("Hasil Pembagian = " +obil.bagi());

        //panggil data yang berbeda
        System.out.println("\n");
        obil.inputData(3, 5, 2);
        System.out.println("Hasil Pertambahan = " +obil.tambah());



    }

}
