package com.company;

public class Drink implements IStock {

    private int price;
    private String name;

    public Drink(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
