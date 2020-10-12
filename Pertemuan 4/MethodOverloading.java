package com.pboreg;

public class MethodOverloading {
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x - y;
    }
    static String plusMethod(String x, String y){
        String hasil = x + " " + y;//variabel lokal
        return hasil;
    }
    static String plusMethod (String x, int y){
        String hasil = "Nama " + x + ", umur " + y + " tahun";
        return hasil;
    }

    public static void main(String[] args) {
        String nilai3 = plusMethod("Rhenaldo", "Muhammad");
        int nilai1 = plusMethod(8, 5);
        double nilai2 = plusMethod(8, 6.26);
        String nilai4 = plusMethod("Andi",17);
        System.out.println("int: " + nilai1);
        System.out.println("double: " + nilai2);
        System.out.println("Nilai String = " + nilai3);
        System.out.println("Keterangan = " + nilai4);
    }
}
