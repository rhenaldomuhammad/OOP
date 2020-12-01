package com.pboreg;

public class CthStringIndexOutOfBoundsException {
    private static final String str = "UPJ JAYA";
    public static void main(String[] args) {
        try {

            for(int i=0; i<str.length(); i++) {
                System.out.println(str.charAt(i+40));
            }
            System.out.println("Length of the String: "+str.length());
        }
        catch (StringIndexOutOfBoundsException e){
            System.err.println("StringIndexOutOfBoundsException Tidak Dapat ditampilkan");
        }
    }
}
