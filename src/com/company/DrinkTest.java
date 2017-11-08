package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTest {
    private Drink drink;

    @Before
    public void setUp(){
        drink = new Drink(90,"Lemonade");
    }

    @Test
    public void drinkHasPrice() {
        assertEquals(90,drink.getPrice());
    }

    @Test
    public void drinkHasName() {
        assertEquals("Lemonade", drink.getName());
    }


}
