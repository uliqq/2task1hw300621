package com.company;

public class Home {

    private String address;
    private String homeType;
    private int floorAmount;

    public Home(String address, String homeType, int floorAmount) {
        this.address = address;
        this.homeType = homeType;
        this.floorAmount = floorAmount;
    }

    public String getAddress() {
        return address;
    }

    public String getHomeType() {
        return homeType;
    }

    public int getFloorAmount() {
        return floorAmount;
    }

}