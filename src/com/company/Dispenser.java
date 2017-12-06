package com.company;

public class Dispenser {
    private StockButton stockButton = new StockButton();
    private IDisplay display;

    public String dispenseIfPurchasable(MoneyBox moneyBox, IStock stock) {
        if(stockButton.stockPurchasable(moneyBox, stock)) {
            moneyBox.subtract(stock.getPrice());
            //display.show(stock.getName() + " is dispensed.");
            return stock.getName() + " is dispensed.";
        } else {
           // display.show("Inadequate funds");
            return "Inadequate funds";
        }
    }
}
