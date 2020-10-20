package com.pboreg;

// player
class Player1{
    String name;
    double health;
    // object member
    Weapon1 weapon;
    Armor1 armor;

    Player1(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon1 weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor1 armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// senjata
class Weapon1{
    double attackPower;
    String name;

    Weapon1(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// armor
class Armor1{
    double defencePower;
    String name;

    Armor1(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}


public class Latihan1 {
    public static void main(String[] args){

        // membuat object player
        Player1 player1 = new Player1("Jett",100);
        Player1 player2 = new Player1("Sova",67);

        // membuat object weapon
        Weapon1 rifles = new Weapon1("Phantom",95);
        Weapon1 rifles2 = new Weapon1("Vandal",85);

        // membuat object armor
        Armor1 bajuBesi = new Armor1("Heavy Shield",50);
        Armor1 bajuAlumunium = new Armor1("Light Shield",25);

        // player 1
        player1.equipWeapon(rifles);
        player1.equipArmor(bajuBesi);
        player1.display();

        // player 2
        player2.equipWeapon(rifles2);
        player2.equipArmor(bajuAlumunium);
        player2.display();
    }
}
