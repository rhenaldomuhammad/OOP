package com.pboreg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CthFileNotFoundException {
    public static void main(String[] args) {
        try {
            File file = new File("Name of Pets");
            FileInputStream fis = new FileInputStream(file);
            System.out.println("Pets in myHome : " +
                    "\n1. Leo" +
                    "\n2. Luna" +
                    "\n3. Molly" +
                    "\n4. Anzy" +
                    "\n5. Miko" +
                    "\n6. Milo");
        } catch (FileNotFoundException e) {
            System.err.println("File Tidak Ditemukan!");
        }
    }

}
