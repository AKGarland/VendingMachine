package com.company;

public class DrinkButton {

    public Boolean drinkPurchasable(MoneyBox moneyBox, Drink drink) {
        if(moneyBox.getTotal() < drink.getPrice()){
            return false;
        }
        System.out.println(drink.getName() + " is available to purchase.");
        return true;
    }
}
