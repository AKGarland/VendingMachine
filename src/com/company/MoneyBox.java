package com.company;

public class MoneyBox {
    private Money currentAmount;
    private int totalAmount = 0;
    private MoneyCalculator moneyCalculator = new MoneyCalculator();

    public int add(Money money) {
        this.totalAmount += money.getValue();
        System.out.println(this.totalAmount);
        return this.totalAmount;
    }

    public int getTotal() {
        return this.totalAmount;
    }

    public int subtract(Money money) {
        this.totalAmount -= money.getValue();
        System.out.println(money.getValue() + " has been subtracted.");
        return this.totalAmount;
    }
}
