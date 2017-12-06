package com.company;

public class MoneyBox {
    private int totalAmount = 0;

    public int add(int amount) {
        this.totalAmount += amount;
        System.out.println(this.totalAmount);
        return this.totalAmount;
    }

    public int getTotal() {
        return this.totalAmount;
    }

    public int subtract(int amount) {
        this.totalAmount -= amount;
        System.out.println(amount + " has been subtracted.");
        return this.totalAmount;
    }
}
