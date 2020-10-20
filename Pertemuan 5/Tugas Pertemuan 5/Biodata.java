package com.pboreg;

class Biodata {
    //Atribute

    //Nama
    private String x = "Muhammad";
    private String y = "Mulberth";
    private String z = "Rhenaldo";


    //NIM
    private int a = 2000000000;
    private int b = 19071000;
    private int c = 39;

    //Jurusan
    private String fname4 = "Informatika";
    public String tampilanf4() {
        return this.fname4;
    }

    //Angkatan
    private int d = 45645;
    private int e = 43626;

    //Panggilan untuk diakses ke public

    public void inputData(int a, int b, int c, int d, int e){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    //Nama Mahasiswa
    public String namaMahasiswa() {
        String hasil = x + " " + y + " " + z;
        return hasil;
    }
    //NIM
    public int tambah() {
        int hasil = this.a + this.b + this.c;
        return hasil;
    }
    //Angkatan
    public int kurang() {
        int hasil = this.d - this.e;
        return hasil;
    }


}
