package com.company;

public class Dispenser {
    private DrinkButton drinkButton = new DrinkButton();

    public String dispenseIfPurchasable(MoneyBox moneyBox, Drink drink) {
        if(drinkButton.drinkPurchasable(moneyBox, drink)) {
            moneyBox.subtract(drink.getPrice());
            return drink.getName() + " is dispensed.";
        } else {
            return "Inadequate funds";
        }
    }
}
