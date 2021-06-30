package com.company;

public class Main {

    public static void main(String[] args) {

        Home home = new Home("Lenina 34", "Ground house", 2);

        Father father = new Father("Volodya", 40, 182, EyeColor.BLUE, home, "Lexus LX570");
        Son son1 = new Son("Maksim", 18, 179, EyeColor.BROWN, home, "Nissan GTR", "Sport Bike");
        Son son2 = new Son("Nikita", 19, 186, EyeColor.GREEN, home, "BMX");

        System.out.println(father.getInfo());
        father.makeWish("I wish to have a last iPhone!");
        System.out.println("____________________________");
        System.out.println(son1.getInfo());
        son1.makeWish("I would love to buy a new house for myself!", 3);
        System.out.println("____________________________");
        System.out.println(son2.getInfo());
        son2.makeWish("Please, I wish to have a lot of money!");
        System.out.println("____________________________");

    }
}