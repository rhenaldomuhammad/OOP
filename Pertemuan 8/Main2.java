package com.pboreg;
//interface

interface Mamalia {
    public void tempatTinggal();
    public void tidur();
}
interface MakhlukHidup{
    public void bernafas();
    public void bernama();
}
class Hewan1 implements Mamalia, MakhlukHidup{
    @Override
    public void tempatTinggal() {
        System.out.println("Tempat Tinggal : Air");
    }

    @Override
    public void tidur() {
        System.out.println("ZZzzzz...");
    }

    @Override
    public void bernafas() {
        System.out.println("Paru-Paru");
    }

    @Override
    public void bernama() {
        System.out.println("Ikan Paus");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Hewan1 paus = new Hewan1();
        paus.bernama();
        paus.bernafas();
        paus.tidur();
    }
}
