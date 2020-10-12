package com.pboreg;

import java.util.*;

public class SistemLogin {
    public static void main(String[] args) {

        int i=0;
        String  id;
        String pass;

        Scanner inputUser = new Scanner(System.in);

        System.out.println("Selamat Datang! sebelum masuk anda sebaiknya login terlebih dahulu");

        do {
            i++;
            //input Username
            System.out.print("username: ");
            id = inputUser.next();

            //input Password
            System.out.print("password: ");
            pass = inputUser.next();


            if (id.equals("rhenaldo") && pass.equals("rhen354")){

                System.out.println("Selamat Datang! Anda Berhasil Login!!");
                return ;

            } else {

                System.out.println("Username dan Password salah! ulangi!");

            }


        }  while (i<3);

        System.out.println("percobaan masuk sudah mencapai batas maksimal, anda tidak diizinkan masuk ke system!");


    }
}
