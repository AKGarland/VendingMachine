package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    private Money money;
    private VendingMachine vendingMachine;
    private DrinkButton drinkButton = new DrinkButton();

    @Before
    public void setUp() {
        money = new Money();
        vendingMachine = new VendingMachine();
    }

    @Test
    public void moneyCanBePassedToMoneyBox() {
        vendingMachine.input(money.twoPound());

        assertEquals(200, vendingMachine.moneyBox().getTotal());
    }

    @Test
    public void drinkCanBeSelected(){
        vendingMachine.input(money.twoPound());
        vendingMachine.input(money.fiftyPence());

        assertEquals(true, drinkButton.drinkPurchasable(vendingMachine.moneyBox(),vendingMachine.drinkList().getDrink(1)));
    }

    @Test
    public void remainingBalanceOneTwentyAfterPurchase() {
        vendingMachine.input(money.twoPound());
        vendingMachine.input(money.twentyPence());
        vendingMachine.input(money.twentyPence());

        vendingMachine.pushButton(2);

        assertEquals(120, vendingMachine.moneyBox().getTotal());
    }

}
