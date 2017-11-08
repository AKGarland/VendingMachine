package com.company;

public class Drink {

    private int price;
    private String name;
    private DrinkButton button;

    public Drink(int price, String name) {
        this.price = price;
        this.name = name;
        this.button = new DrinkButton();
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public DrinkButton getButton() {
        return button;
    }
}
