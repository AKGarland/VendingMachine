package com.company;

public class MoneyCalculator {

    public Boolean drinkCanBeBought(MoneyBox moneyBox, Drink drink) {
        if(moneyBox.getTotal() < drink.getPrice()){
            return false;
        }
        return true;
    }
}
