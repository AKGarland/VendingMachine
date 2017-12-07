package com.company;

import java.util.Scanner;

public class Main {

    static VendingMachine vendingMachine = new VendingMachine(new ConsoleDisplay());

    public static void main(String[] args){


        runMenu();
    }

    private static void runMenu() {
        IDisplay display = vendingMachine.getDisplay();
        vendingMachine.stockList().printMenu();
    }

}
