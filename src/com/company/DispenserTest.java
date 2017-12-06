package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DispenserTest implements IDisplay, IStock {
    private Dispenser dispenser = new Dispenser();
    private VendingMachine vendingMachine = new VendingMachine(this);
    private Money money = new Money();
    private String text;
    private String name;
    private int price;

    @Test
    public void stockIsDispensedWhenStockIsPurchasable(){
        IStock stock = vendingMachine.stockList().getStock(2);

        vendingMachine.insertCoin(250);

        assertEquals("Cola is dispensed.", dispenser.dispenseIfPurchasable(vendingMachine.moneyBox(), stock));
    }

    @Test
    public void stockIsNotDispensedWithoutAdequateFunds() {
        IStock stock = vendingMachine.stockList().getStock(2);

        assertEquals("Inadequate funds", dispenser.dispenseIfPurchasable(vendingMachine.moneyBox(), stock));
    }

    @Override
    public void show(String text) {
        this.text = text;

    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
