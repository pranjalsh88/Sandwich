package com.pranjsha.cisco;

public class Sandwich {
    final int itemID;
    final String name;
    final double price;
    final double prepTime;
    final String description;

    public Sandwich(String name, double price, double prepTime, int itemID, String description) {
        this.name = name;
        this.price = price;
        this.prepTime = prepTime;
        this.itemID = itemID;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public double getPrepTime() {
        return prepTime;
    }


}
