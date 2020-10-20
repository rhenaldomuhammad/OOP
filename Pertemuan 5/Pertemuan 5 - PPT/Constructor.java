package com.pboreg;

public class Constructor {
    public static class Car{
        int modelYear;
        String modelName;

        public Car(int year, String name){
            modelYear = year;
            modelName = name;
        }
    }


    public Constructor(){
        x = 5;
    }
    public Constructor(int y){
        x = y;
    }
    int x;

    public static void main(String[] args) {
        Constructor myObj = new Constructor(5);
        System.out.println(myObj.x);


        Car myCar = new Car(1968, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
