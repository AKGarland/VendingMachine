package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DrinkListTest {
    private Drink greenTea;
    private DrinkList drinkList;

    @Before
    public void setUp() {
        greenTea = new Drink(240, "Green tea");
        drinkList = new DrinkList();
        drinkList.addDrinkToList(greenTea);
    }

    @Test
    public void drinkListContainsGreenTea() {
        assertEquals("Green tea", drinkList.getDrinkList().get(0).getName());
    }


}

