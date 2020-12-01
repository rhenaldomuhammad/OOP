package com.pboreg;

public class CthNumberFormatException {

    private static final String inputString = "354.313";

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(inputString);
        }catch(NumberFormatException e){
            System.err.println("Input String tidak bisa dilakukan");
        }
    }
}
