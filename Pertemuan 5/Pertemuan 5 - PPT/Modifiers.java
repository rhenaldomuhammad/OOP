package com.pboreg;

public class Modifiers {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        Modifiers objKu = new Modifiers();
//        objKu.x = 50;
//        objKu.PI = 25;
        System.out.println(objKu.x);
        System.out.println(objKu.PI);
    }
}
