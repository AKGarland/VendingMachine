package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Money money = new Money();
        VendingMachine vendingMachine = new VendingMachine(new ConsoleDisplay());

        vendingMachine.insertCoin(250);

        vendingMachine.pushButton(2);



    }

}
