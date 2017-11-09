package com.company;

public class Main {

    public static void main(String[] args){
        Money money = new Money();
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.input(money.twoPound());
        vendingMachine.input(money.twentyPence());
    }
}
