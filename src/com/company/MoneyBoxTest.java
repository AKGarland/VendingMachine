package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyBoxTest implements IDisplay {
    private MoneyBox moneyBox;
    private VendingMachine vendingMachine;
    private String text;

    @Before
    public void setUp() {
        moneyBox = new MoneyBox();
        vendingMachine = new VendingMachine(this);
    }

    @Test
    public void takesTenPenceAndContainsTenPence() {
        moneyBox.add(10);

        assertEquals(10, moneyBox.getTotal());
    }

    @Test
    public void returnsFortyWhenTenIsDeductedFromFifty() {
        moneyBox.add(50);
        moneyBox.subtract(10);

        assertEquals(40, moneyBox.getTotal());
    }

    @Test
    public void tenPenceReturnedAfterBuyingGreenTea() {
        vendingMachine.insertCoin(250);
        vendingMachine.pushButton(1);

        assertEquals(10, moneyBox.getTotal());
    }

    @Override
    public void show(String text) {
        this.text = text;
    }
}
