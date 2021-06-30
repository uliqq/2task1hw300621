package com.company;

public class GrandFather {

    private String name;
    private int age;
    private int height;
    private EyeColor eyeColor;
    private Home home;

    public GrandFather() {
    }

    public GrandFather(String name, int age, int height, EyeColor eyeColor, Home home) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
        this.home = home;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public Home getHome() {
        return home;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getInfo () {
        return "Name: " + name + "\nAge: " + age + "\nHeight: " + height +
                "\nEye color: " + eyeColor + "\nHome address: " + home.getAddress() +
                "\nHouse type: " + home.getHomeType() + "\nHouse floors: " + home.getFloorAmount();
    }
}
