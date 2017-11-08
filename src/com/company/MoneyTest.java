package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {
    private Money money;

    @Before
    public void setUp() {
        money = new Money();
    }
    @Test
    public void moneyClassHasTenPence(){
        assertEquals(10,money.getTenPence());
    }

    @Test
    public void moneyClassHasTwentyPence(){
        assertEquals(20,money.getTwentyPence());
    }

    @Test
    public void moneyClassHasFiftyPence(){
        assertEquals(50,money.getFiftyPence());
    }

    @Test
    public void moneyClassHasOnePound(){
        assertEquals(100,money.getOnePound());
    }

    @Test
    public void moneyClassHasTwoPound(){
        assertEquals(200,money.getTwoPound());
    }
}
