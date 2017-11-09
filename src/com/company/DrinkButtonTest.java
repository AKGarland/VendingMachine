package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkButtonTest {
    private MoneyBox moneyBox;
    private Money money;
    private VendingMachine vendingMachine;

    @Before
    public void setUp() {
        money = new Money();
        vendingMachine = new VendingMachine();
    }

    @Test
    public void drinkButtonSwitchesOnWhenMoneyBoxHasSufficientFunds() {
        vendingMachine.input(money.twoPound());
        vendingMachine.input(money.fiftyPence());

        assertEquals(true, vendingMachine.drinkList().getDrink(1).getButton().getLightStatus());
    }

    @Test
    public void buttonCannotBePushedWhenLightOff() {
        assertEquals("Insufficient funds for this item", vendingMachine.drinkList().getDrink(1).getButton().pushButton());
    }


}
