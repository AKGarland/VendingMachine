package com.company;

import java.util.ArrayList;

public class DrinkList {
    public ArrayList<Drink> drinkList = new ArrayList<>();

    public DrinkList() {
        this.drinkList = new ArrayList<>();
        Drink greenTea = new Drink(240, "Green tea");
        Drink cola = new Drink(120, "Cola");
        Drink mountainDew = new Drink(300, "Mountain Dew");
        Drink milkshake = new Drink(250, "Fudge milkshake");

        this.drinkList.add(greenTea);
        this.drinkList.add(cola);
        this.drinkList.add(mountainDew);
        this.drinkList.add(milkshake);
    }

    public ArrayList<Drink> getDrinkList() {
        return drinkList;
    }

    public Drink getDrink(int number) {
        if(number<1){
            System.out.println("The drink number must be larger than or equal to 1");
            return null;
        }
        System.out.println(drinkList.get(number-1).getName() + " has been found.");
        return drinkList.get(number-1);
    }

    public void addDrinkToList(Drink drink) {
        this.drinkList.add(drink);
        System.out.println(drink.getName() + " has been added to the vending machine.");
    }
}
