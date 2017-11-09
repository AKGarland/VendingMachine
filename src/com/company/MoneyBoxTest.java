package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyBoxTest {
    private Money money;
    private MoneyBox moneyBox;

    @Before
    public void setUp() {
        money = new Money();
        moneyBox = new MoneyBox();
    }

    @Test
    public void moneyBoxTakesTenPenceAndContainsTenPence() {
        moneyBox.add(money.tenPence());

        assertEquals(10, moneyBox.getTotal());
    }

    @Test
    public void moneyBoxTakesTwoTenPenceAndContainsTwentyPence() {
        moneyBox.add(money.tenPence());
        moneyBox.add(money.tenPence());

        assertEquals(20, moneyBox.getTotal());
    }

    @Test
    public void moneyBoxReturnsFortyWhenTenIsDeductedFromFifty() {
        moneyBox.add(money.fiftyPence());
        moneyBox.subtract(money.tenPence());

        assertEquals(40, moneyBox.getTotal());
    }
}
