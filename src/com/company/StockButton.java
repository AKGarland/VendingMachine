package com.company;

public class StockButton {

    public Boolean stockPurchasable(MoneyBox moneyBox, IStock stock) {
        if(moneyBox.getTotal() < stock.getPrice()){
            return false;
        }
        System.out.println(stock.getName() + " is available to purchase.");
        return true;
    }
}
