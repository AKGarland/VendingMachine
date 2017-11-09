package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    @Test
    public void moneyCanBePassedToMoneyBox() {
        Money money = new Money();
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.input(money.twoPound());

        assertEquals(200, vendingMachine.moneyBox().getTotal());
    }

    @Test
    public void drinkCanBeSelected(){
        Money money = new Money();
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.input(money.twoPound());
        vendingMachine.input(money.fiftyPence());

        assertEquals(true,vendingMachine.drinkList().getDrink(1).getButton().getLightStatus());
    }
}
