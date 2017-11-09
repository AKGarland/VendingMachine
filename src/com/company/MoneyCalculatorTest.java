package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyCalculatorTest {
    private Drink greenTea;
    private DrinkList drinkList;
    private MoneyBox moneyBox;
    private MoneyCalculator moneyCalculator;

    @Before
    public void setUp() {
        greenTea = new Drink(240, "Green tea");
        drinkList = new DrinkList();
        drinkList.addDrinkToList(greenTea);
    }

    @Test
    public void hasMethodThatReturnsTrueWhenComparingAdequateMoneyBoxTotalWithDrinkPrice() {
        moneyBox = new MoneyBox();
        moneyCalculator = new MoneyCalculator();
        Money money = new Money();
        moneyBox.add(money.twoPound());
        moneyBox.add(money.twoPound());

        moneyCalculator.drinkCanBeBought(moneyBox, greenTea);
        assertEquals(true, moneyCalculator.drinkCanBeBought(moneyBox, greenTea));
    }
}
