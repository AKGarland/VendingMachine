package com.company;

public class VendingMachine {
    private MoneyBox moneyBox = new MoneyBox();
    private MoneyCalculator moneyCalculator = new MoneyCalculator();
    private DrinkList drinkList = new DrinkList();

    public void input(Money money) {
        moneyBox.add(money);
        for (Drink drink : drinkList.getDrinkList()) {
            if (this.moneyCalculator.drinkCanBeBought(moneyBox,drink)) {
                drink.getButton().setLightStatus(true);
            }
        }
    }

    public MoneyBox moneyBox() {
        return this.moneyBox;
    }

    public DrinkList drinkList() {
        return drinkList;
    }
}
