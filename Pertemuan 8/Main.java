package com.pboreg;
//class abstrack
abstract class Hewan {
    //Abstract Method (tidak memiliki body)
    public abstract void suaraHewan();

    //Regular Method
    public void tidur() {
        System.out.println("Zzz....");
    }
}

//Subclass (turunan dari Class Hewan)
class Ayam extends Hewan{
    public void suaraHewan() {
        //body dari abstract method suaraHewan() ditulis disini
        System.out.println("Kukuruyuuuuukkkkkk...");
    }
}
class Kucing extends Hewan{
    public void suaraHewan() {
        System.out.println("Meong... Meonggggg.....");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Ayam ayamku = new Ayam(); //membuat object ayam
        ayamku.suaraHewan();
        ayamku.tidur();

        Kucing kucingku = new Kucing();
        kucingku.suaraHewan();
        kucingku.tidur();
    }
}
