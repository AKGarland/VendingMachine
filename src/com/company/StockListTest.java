package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockListTest {
    private Drink greenTea;
    private StockList stockList;

    @Before
    public void setUp() {
        greenTea = new Drink(240, "Green tea");
        stockList = new StockList();
        stockList.addStockToList(greenTea);
    }

    @Test
    public void menuListContainsGreenTea() {
        assertEquals("Green tea", stockList.getMenu().get(0).getName());
    }


}

