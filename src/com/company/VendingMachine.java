package com.company;

public class VendingMachine {
    private MoneyBox moneyBox = new MoneyBox();
    private DrinkButton drinkButton = new DrinkButton();
    private DrinkList drinkList = new DrinkList();
    private Dispenser dispenser = new Dispenser();

    public void input(Money money) {
        this.moneyBox.add(money);
        for (Drink drink : this.drinkList.getDrinkList()) {
            drinkButton.drinkPurchasable(this.moneyBox, drink);
        }
    }

    public MoneyBox moneyBox() {
        return this.moneyBox;
    }

    public DrinkList drinkList() {
        return this.drinkList;
    }

    public String pushButton(int drinkNumber) {
        Drink drink = this.drinkList.getDrink(drinkNumber);
        if(drinkNumber>0 && drinkNumber<this.drinkList.getDrinkList().size()) {
            dispenser.dispenseIfPurchasable(this.moneyBox,drink);
        }
        return "This drink does not exist";
    }
}
