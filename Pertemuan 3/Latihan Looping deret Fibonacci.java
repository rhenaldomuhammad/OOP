package com.pboreg;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //menghitung fibbonacci
        int fn, fn1, fn2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - :");
        n = inputUser.nextInt();

        fn2 = 0;
        fn1 = 1;
        fn = 1;


        for(int i = 1; i <= n; i++){
            System.out.println("nilai ke - " + i + " adalah " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }

    }
}
