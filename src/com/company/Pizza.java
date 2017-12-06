package com.company;

public class Pizza implements IStock {

    private int price;
    private String name;

    public Pizza(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
