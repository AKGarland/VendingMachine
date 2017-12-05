package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkButtonTest {
    private Drink greenTea;
    private DrinkList drinkList;
    private MoneyBox moneyBox;
    private DrinkButton drinkButton;

    @Before
    public void setUp() {
        greenTea = new Drink(240, "Green tea");
        drinkList = new DrinkList();
        drinkList.addDrinkToList(greenTea);
    }

    @Test
    public void hasMethodThatReturnsTrueWhenComparingAdequateMoneyBoxTotalWithDrinkPrice() {
        moneyBox = new MoneyBox();
        drinkButton = new DrinkButton();
        Money money = new Money();
        moneyBox.add(money.twoPound());
        moneyBox.add(money.twoPound());

        drinkButton.drinkPurchasable(moneyBox, greenTea);
        assertEquals(true, drinkButton.drinkPurchasable(moneyBox, greenTea));
    }
}
