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

//    @Test
//    public void moneyBoxTakesTwoTenPencesAndContainsTwentyPence() {
//        moneyBox.add(money.getTenPence());
//        moneyBox.add(money.getTenPence());
//
//        assertEquals(20, moneyBox.getTotal());
//    }
//
//    @Test
//    public void moneyBoxReturnsFortyWhenTenIsDeductedFromFifty() {
//        moneyBox.add(money.getFiftyPence());
//        moneyBox.subtract(money.getTenPence());
//
//        assertEquals(40, moneyBox.getTotal());
//    }
}
