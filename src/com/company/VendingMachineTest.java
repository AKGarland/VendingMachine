package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    private Money money;
    private VendingMachine vendingMachine;

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

        assertEquals(true,vendingMachine.drinkList().getDrink(1).getButton().getLightStatus());
    }

    @Test
    public void drinkIsDispensedWhenPurchased() {
        vendingMachine.input(money.twoPound());
        vendingMachine.input(money.twentyPence());
        vendingMachine.input(money.twentyPence());

        assertEquals("Cola is dispensed.", vendingMachine.pushButton(2));
    }


}
