package com.company;

public class Coins implements PaymentInterface, GivesChangeInterface {
    @Override
    public int giveChange() {
        return 0;
    }

    @Override
    public int takePayment() {
        return 0;
    }
}
