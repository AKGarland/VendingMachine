package com.company;

public class VendingMachine {
    private MoneyBox moneyBox = new MoneyBox();
    private StockButton stockButton = new StockButton();
    private StockList stockList = new StockList();
    private Dispenser dispenser = new Dispenser();
    private IDisplay display;

    public VendingMachine(IDisplay display) {
        this.display = display;
        display.show("Insert Coins or Card");
    }

    public void insertCoin(int amount) {
        display.show("Current Balance is 240");
        Coins coins = new Coins();
        input(amount, coins);
    }

    public void tapCard(int amount) {
        PaymentCard paymentCard = new PaymentCard();
        input(amount, paymentCard);
    }

    public IDisplay getDisplay() {
        return display;
    }

    private void input(int amount, PaymentInterface payment) {
        payment.takePayment();

        this.moneyBox.add(amount);
        displayStockIfPurchaseable();
    }

    private void displayStockIfPurchaseable() {
        for (IStock stock : this.stockList.getMenu()) {
            stockButton.stockPurchasable(this.moneyBox, stock);
        }
    }

    public MoneyBox moneyBox() {
        return this.moneyBox;
    }

    public StockList stockList() {
        return this.stockList;
    }

    public String pushButton(int stockNumber) {
        IStock stock = this.stockList.getStock(stockNumber);
        if(stockNumber>0 && stockNumber<this.stockList.getMenu().size()) {
            display.show("Stock Selected");
            dispenser.dispenseIfPurchasable(this.moneyBox, stock);
        }
        return "This stock does not exist";
    }
}
