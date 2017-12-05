package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DispenserTest {
    private Dispenser dispenser = new Dispenser();
    private VendingMachine vendingMachine = new VendingMachine();
    private Money money = new Money();

    @Test
    public void drinkIsDispensedWhenDrinkIsPurchasable(){
        Drink drink = vendingMachine.drinkList().getDrink(2);

        vendingMachine.input(money.twoPound());
        vendingMachine.input(money.twentyPence());
        vendingMachine.input(money.twentyPence());

        assertEquals("Cola is dispensed.", dispenser.dispenseIfPurchasable(vendingMachine.moneyBox(), drink));
    }

    @Test
    public void drinkIsNotDispensedWithoutAdequateFunds() {
        Drink drink = vendingMachine.drinkList().getDrink(2);

        assertEquals("Inadequate funds", dispenser.dispenseIfPurchasable(vendingMachine.moneyBox(), drink));
    }
}
