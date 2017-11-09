package com.company;

public class MoneyCalculator {

    public Boolean drinkCanBeBought(MoneyBox moneyBox, Drink greenTea) {
        if(moneyBox.getTotal() < greenTea.getPrice()){
            return false;
        }
        return true;
    }
}
