package com.company;

public class Money {

    private int value;

    public int getValue() {
        return value;
    }

    public Money tenPence() {
        Money money = new Money();
        money.value = 10;
        return money;
    }

    public Money twentyPence() {
        Money money = new Money();
        money.value = 20;
        return money;
    }
    public Money fiftyPence() {
        Money money = new Money();
        money.value = 50;
        return money;
    }

    public Money onePound() {
        Money money = new Money();
        money.value = 100;
        return money;
    }

    public Money twoPound() {
        Money money = new Money();
        money.value = 200;
        return money;
    }
}
