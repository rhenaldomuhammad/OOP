package com.pboreg;

abstract class Person{
    public String fname = "Rhen";
    public int age = 19;
    public abstract void study();
}

class Student extends Person {
    public int graduationYear = 2019;
    public void study() {
        System.out.println("Studying all long day");
    }
}


public class Abstrack {
    public static void main(String[] args) {
        Student objKui =  new Student();

        System.out.println("Name = " + objKui.fname);
        System.out.println("Age = " + objKui.age);
        System.out.println("Graduation Year = " + objKui.graduationYear);
        objKui.study();
    }

}
