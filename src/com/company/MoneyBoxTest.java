package com.company;

import org.junit.Test;

public class MoneyBoxTest {

    @Test
    public void moneyBoxTakesTenPenceAndContainsTenPence() {
        Money money = new Money();
        MoneyBox moneyBox = new MoneyBox();
        moneyBox.add(money.getTwentyPence());


    }
}
