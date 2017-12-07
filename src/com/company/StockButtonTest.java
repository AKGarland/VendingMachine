package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockButtonTest {
    private Drink greenTea;
    private StockList stockList;
    private MoneyBox moneyBox;
    private StockButton stockButton;

    @Before
    public void setUp() {
        greenTea = new Drink(240, "Green tea");
        stockList = new StockList();
        stockList.addStockToList(greenTea);
    }

    @Test
    public void hasMethodThatReturnsTrueWhenComparingAdequateMoneyBoxTotalWithDrinkPrice() {
        moneyBox = new MoneyBox();
        stockButton = new StockButton();
        moneyBox.add(400);

        stockButton.stockPurchasable(moneyBox, greenTea);
        assertEquals(true, stockButton.stockPurchasable(moneyBox, greenTea));
    }
}
