package com.company;

public class Fries implements IStock{
    private String name;
    private int price;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    public Fries( int price, String name) {
        this.name = name;
        this.price = price;
    }
}
