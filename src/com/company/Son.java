package com.company;

public final class Son extends Father {

    private String bike;

    public Son() {
    }

    public Son(String name, int age, int height, EyeColor eyeColor, Home home, String car, String bike) {
        super(name, age, height, eyeColor, home, car);
        this.bike = bike;
    }

    public Son(String name, int age, int height, EyeColor eyeColor, Home home, String bike) {
        super(name, age, height, eyeColor, home, bike);
        this.bike = bike;
    }

    public String getBike() {
        return bike;
    }

    @Override
    public void makeWish(String wish) {
        if (bike == "BMX") {
            System.out.println("Wish: I don't wish anything!");
        } else {
            super.makeWish(wish);
        }
    }

    @Override
    public String getInfo() {
        if (getCar() == bike) {
            return "Name: " + getName() + "\nAge: " + getAge() + "\nHeight: " + getHeight() +
                    "\nEye color: " + getEyeColor() + "\nHome address: " + getHome().getAddress() +
                    "\nHouse type: " + getHome().getHomeType() + "\nHouse floors: " + getHome().getFloorAmount() + "\nBike: " + bike;
        } else {
            return super.getInfo() + "\nBike: " + bike;
        }
    }
}

