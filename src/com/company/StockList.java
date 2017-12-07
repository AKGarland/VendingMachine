package com.company;

import java.util.ArrayList;

public class StockList {
    public ArrayList<IStock> menu = new ArrayList<>();
    private IDisplay display = new ConsoleDisplay();

    public StockList() {
        this.menu = new ArrayList<>();
        Drink greenTea = new Drink(240, "Green tea");
        Drink cola = new Drink(120, "Cola");
        Drink mountainDew = new Drink(300, "Mountain Dew");
        Drink milkshake = new Drink(250, "Fudge milkshake");
        Pizza chickenTikka = new Pizza(500, "Chicken Tikka Pizza");
        Pizza sweetcornBbq = new Pizza(650, "Sweetcorn Bbq Pizza");
        Fries cheesyfries = new Fries(220, "Cheesy Fries");
        Fries perifries = new Fries(205, "Peri Fries");

        this.menu.add(greenTea);
        this.menu.add(cola);
        this.menu.add(mountainDew);
        this.menu.add(milkshake);
        this.menu.add(chickenTikka);
        this.menu.add(sweetcornBbq);
        this.menu.add(cheesyfries);
        this.menu.add(perifries);
    }

    public ArrayList<IStock> getMenu() {
        return menu;
    }

    public IStock getStock(int number) {
        if(number<1){
            System.out.println("The stock number must be larger than or equal to 1");
            return null;
        }
        System.out.println(menu.get(number-1).getName() + " has been found.");
        return menu.get(number-1);
    }

    public void printMenu() {
        this.display.show("\n**********MENU**********");
        for (IStock stock: menu) {
            this.display.show(stock.getName() + " costs " + stock.getPrice());
        }
        this.display.show("\n");
    }

    public void addStockToList(IStock stock) {
        this.menu.add(stock);
    }
}
