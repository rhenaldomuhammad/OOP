package com.pboreg;

class Player2{
    String name;
    double health;
    // object member
    Weapon2 weapon;
    Armor2 armor;

    Player2(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player2 opponent){
        double attackPower = this.weapon.attackPower;

        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    void defence(double attackPower){
        // akan mengambil damage
        double damage;
        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }

    void equipWeapon(Weapon2 weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor2 armor){
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
class Weapon2{
    double attackPower;
    String name;

    Weapon2(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// armor
class Armor2{
    double defencePower;
    String name;

    Armor2(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}

public class Latihan2 {

    public static void main(String[] args) {

        // membuat object player
        Player2 player1 = new Player2("Jett",100);
        Player2 player2 = new Player2("Sova",67);

        // membuat object weapon
        Weapon2 rifles = new Weapon2("Phantom",60);
        Weapon2 rifles2 = new Weapon2("Vandal",70);

        // membuat object armor
        Armor2 bajuBesi = new Armor2("Heavy Shield",50);
        Armor2 bajuAlumunium = new Armor2("Light Shield",25);

        // player 1
        player1.equipWeapon(rifles);
        player1.equipArmor(bajuBesi);
        player1.display();

        // player 2
        player2.equipWeapon(rifles2);
        player2.equipArmor(bajuAlumunium);
        player2.display();

        System.out.println("\nRANKED - MAP ICEBOX");
        System.out.println("\nROUND - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nROUND - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
