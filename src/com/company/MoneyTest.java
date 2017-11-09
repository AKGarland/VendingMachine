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
        assertEquals(10,money.tenPence().getValue());
    }

    @Test
    public void moneyClassHasTwentyPence(){
        assertEquals(20,money.twentyPence().getValue());
    }

    @Test
    public void moneyClassHasFiftyPence(){
        assertEquals(50,money.fiftyPence().getValue());
    }

    @Test
    public void moneyClassHasOnePound(){
        assertEquals(100,money.onePound().getValue());
    }

    @Test
    public void moneyClassHasTwoPound(){
        money.twoPound();
        assertEquals(200,money.twoPound().getValue());
    }
}
