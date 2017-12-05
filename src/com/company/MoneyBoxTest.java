package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyBoxTest {
    private Money money;
    private MoneyBox moneyBox;
    private VendingMachine vendingMachine;

    @Before
    public void setUp() {
        money = new Money();
        moneyBox = new MoneyBox();
        vendingMachine = new VendingMachine();
    }

    @Test
    public void takesTenPenceAndContainsTenPence() {
        moneyBox.add(money.tenPence());

        assertEquals(10, moneyBox.getTotal());
    }

    @Test
    public void takesTwoTenPenceAndContainsTwentyPence() {
        moneyBox.add(money.tenPence());
        moneyBox.add(money.tenPence());

        assertEquals(20, moneyBox.getTotal());
    }

    @Test
    public void returnsFortyWhenTenIsDeductedFromFifty() {
        moneyBox.add(money.fiftyPence());
        moneyBox.subtract(10);

        assertEquals(40, moneyBox.getTotal());
    }

}
