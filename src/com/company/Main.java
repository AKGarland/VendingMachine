package com.company;

public class Main {

    public static void main(String[] args){
        Drink greenTea = new Drink(240, "Green tea");
        DrinkList drinkList = new DrinkList();
        drinkList.addDrinkToList(greenTea);
        MoneyBox moneyBox = new MoneyBox();
    }
}
