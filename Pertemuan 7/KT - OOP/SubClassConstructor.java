package com.pboreg;

class Hero3{
    //atribut
    String name;
    double defencePower;

    //constructor
    Hero3(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    Hero3(String name){
        this.name = name;
    }
    // method
    void display(){
        System.out.println("Name = " + this.name);
    }
}

//subclass
class HeroStength3 extends Hero3{

    //constructor
    HeroStength3(String name, double defencePower){
        super(name,defencePower);
    }
    HeroStength3(String name){
        super(name);
    }

}

public class SubClassConstructor {
    public static void main(String[] args) {
        Hero3 hero1 = new Hero3("esmerlda",10); //inimemakai constructor superclass
        hero1.display();

        HeroStength3 hero2 = new HeroStength3("Ucup", 100);
        hero2.display();

        HeroStength3 hero3 = new HeroStength3("Otong");
        hero3.display();
    }
}
