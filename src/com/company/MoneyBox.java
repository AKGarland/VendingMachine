package com.company;

public class MoneyBox {
    private Money currentAmount;
    private int totalAmount = 0;
    private DrinkButton drinkButton = new DrinkButton();

    public int add(Money money) {
        this.totalAmount += money.getValue();
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
