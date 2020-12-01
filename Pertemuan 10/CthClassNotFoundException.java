package com.pboreg;

public class CthClassNotFoundException {
    public static void main(String[] args) {
        try {
            Class.forName("ArrayJava");
        }
        catch (ClassNotFoundException e) {
            System.err.println("Class tidak ditemukan");
        }
    }
}
