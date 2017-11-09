package com.company;

public class MoneyBox {
    private Money currentAmount;
    private int totalAmount = 0;

    public int add(Money money) {
        this.totalAmount += money.getValue();
        System.out.println(money + " has been added.");
        return this.totalAmount;
    }

    public int getTotal() {
        System.out.println("Your total amount is " + this.totalAmount);
        return this.totalAmount;
    }

    public int subtract(Money money) {
        this.totalAmount += money.getValue();
        System.out.println(money + " has been subtracted.");
        return this.totalAmount;
    }
}
