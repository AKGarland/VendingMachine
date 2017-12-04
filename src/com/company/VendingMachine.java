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
                System.out.println(drink.getName() + " is available to purchase.");
            }
        }
    }

    public MoneyBox moneyBox() {
        return this.moneyBox;
    }

    public DrinkList drinkList() {
        return drinkList;
    }

    public String pushButton(int drinkNumber) {
        if(drinkNumber>0 && drinkNumber<drinkList.getDrinkList().size()) {
            return drinkList.getDrinkList().get(drinkNumber - 1).getName() + " is dispensed.";
        }
        return "This drink does not exist";
    }
}
