package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest implements IDisplay {
    private VendingMachine vendingMachine;
    private StockButton stockButton = new StockButton();
    private String text;

    @Before
    public void setUp() {
        vendingMachine = new VendingMachine(this);
    }

    @Test
    public void moneyCanBePassedToMoneyBox() {
        vendingMachine.insertCoin(200);

        assertEquals(200, vendingMachine.moneyBox().getTotal());
    }

    @Test
    public void drinkCanBeSelected(){
        vendingMachine.insertCoin(250);

        assertEquals(true, stockButton.stockPurchasable(vendingMachine.moneyBox(),vendingMachine.stockList().getStock(1)));
    }

    @Test
    public void remainingBalanceOneTwentyAfterPurchase() {
        vendingMachine.insertCoin(240);
        vendingMachine.pushButton(2);

        assertEquals(120, vendingMachine.moneyBox().getTotal());
    }

    @Test
    public void displaysInsertCoinsOnInstantiation() {
        vendingMachine = new VendingMachine(this);

        assertEquals("Insert Coins or Card", this.text);
    }

    @Test
    public void displaysCurrentBalanceOnInsertCoins() {
        vendingMachine = new VendingMachine(this);
        vendingMachine.insertCoin(240);

        assertEquals("Current Balance is 240", this.text);
    }

    @Test
    public void displaysDrinkSelectedWhenButtonPushed() {
        vendingMachine = new VendingMachine(this);
        vendingMachine.insertCoin(240);
        vendingMachine.pushButton(2);

        assertEquals("Stock Selected", this.text);
       //assertEquals("Remaining balance: 120p", this.text);
    }

    @Override
    public void show(String text) {
        this.text = text;
    }
}
