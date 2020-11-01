package com.pboreg;

// this.name akan mengakses atribut name kalau ada diclass ini jika tidak ada akan mengakses dr superclass
//
// super.name akan selalu mengakses atribut super class
public class HeroStrength2 extends Hero2{
    String name = "Class Strength";
    void display(){
        System.out.println("ini adalah " + this.name);
        this.dummyyMethod();
    }

    void displaySuper(){
        System.out.println("ini adalah " + super.name);
        super.dummyyMethod();
    }
    void dummyyMethod(){
        System.out.println("Method ini ada di subclass");
    }
}
