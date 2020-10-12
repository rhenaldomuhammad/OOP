package com.pboreg;

public class Main {
    static void myMethod(String fname, int age){
        System.out.println(fname + " Refsnes" + " is " + age);
    }
    static int myMethod(int x){
        return 5 + x;
    }
    static int myMethod(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {

        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);

        System.out.println("\n");
        System.out.println(myMethod(3)); //Return Value

        System.out.println("\n");
        System.out.println(myMethod(5, 3));

        System.out.println("\n");
        int z = myMethod(5, 3);
        System.out.println(z);
    }

}
//Liam Refsnes
//Jenny Refsnes
//Anja Refsnes

// outputs 8 (5 + 3)
// outputs 8 (5 + 3)
