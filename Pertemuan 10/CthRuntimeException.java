package com.pboreg;

public class CthRuntimeException {
    public static void main(String[] args) {
        try {
            int array[] = {20,20,40};
            System.out.println("Nilai = " + array[4]);

            int angka = 7;
            int hasil = angka/2;
            System.out.println(hasil);
        } catch (ArithmeticException e) {
            System.out.println("Tidak boleh membagi sebuah bilangan dengan nol");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Runtime Error!! Data Array yang ingin ditampilkan tidak ada");
        }
    }

}
