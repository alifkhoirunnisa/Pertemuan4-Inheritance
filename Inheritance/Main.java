/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author UsEr
 */
public class Main {
        public static void main(String[] args) {
    Enemy monster = new Enemy();
    
    Zombie zumbi = new Zombie();
    zumbi.name ="Zumbie";
    zumbi.hp = 70;
    zumbi.attackpoin=10;
    System.out.println(zumbi.name +" Healt Poin = "+zumbi.hp + " Attack poin = "+zumbi.attackpoin);
    zumbi.attack();
    zumbi.walk();
    
    Pocong hantupocong = new Pocong();
    hantupocong.name ="Pucong";
    hantupocong.hp = 80;
    hantupocong.attackpoin = 15;
    System.out.println(hantupocong.name +" Healt Poin = "+hantupocong.hp + " Attack poin = "+hantupocong.attackpoin);
    hantupocong.attack();
    hantupocong.jump();
    
    Burung garuda = new Burung();
    garuda.name ="Garuda";
    garuda.hp = 90;
    garuda.attackpoin = 20;
    System.out.println(garuda.name + " healt Poin = "+garuda.hp + " Attack Poin = "+garuda.attackpoin);
    garuda.attack();
    garuda.walk();
    garuda.jump();
    garuda.fly();
    }

}
