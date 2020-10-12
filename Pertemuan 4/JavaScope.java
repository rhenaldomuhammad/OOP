package com.pboreg;

public class JavaScope {
    public static void main(String[] args) {
        //Method Scope
        // code here cannot use a

        int a = 100;

        //code here can use a
        System.out.println(a);
        { //this is  block

            //code here CANNOT use b
          int b = 100;

          //code here CAN use b
            System.out.println(b);

        } // the block ends here
        // here cannot use x
    }
}
