package com.pboreg;


class Mahasiswa2{
    // Data member
    String nama;
    String NIM;

    // constructor
    Mahasiswa2(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}


public class Method {
    public static void main(String[] args) {
        Mahasiswa2 mahasiswa2 = new Mahasiswa2("Rhenaldo","2019071039");
        // method
        mahasiswa2.show();
        mahasiswa2.setNama("Mulberth");
        mahasiswa2.show();


        System.out.println(mahasiswa2.getNama());
        System.out.println(mahasiswa2.getNIM());

        String data = mahasiswa2.sayHi("ganteng");
        System.out.println(data);
    }
}
