package com.pboreg;

public class Main {

    public static void main(String[] args) {

       // do{
            //
       // } while (kondisi);

        System.out.println("awal program");

        int a = 0;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("do while ke-" + a);
            if (a == 1){
                kondisi = false;
            }
        }while(kondisi);

        System.out.println("akhir program");
    }

}
