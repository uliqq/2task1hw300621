package com.company;

public class Father extends GrandFather {

    private String car;


    public Father() {
    }

    public Father(String name, int age, int height, EyeColor eyeColor, Home home, String car) {
        super(name, age, height, eyeColor, home);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void makeWish(String wish) {
        System.out.println("Wish: " + wish);
    }

    public final void makeWish(String wish, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Wish: " + wish);
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nCar: " + car;
    }
}
