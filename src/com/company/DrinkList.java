package com.company;

import java.util.ArrayList;

public class DrinkList {
    public ArrayList<Drink> drinkList = new ArrayList<>();

    public DrinkList() {
        this.drinkList = new ArrayList<>();
    }

    public ArrayList<Drink> getDrinkList() {
        return drinkList;
    }

    public void addDrinkToList(Drink drink) {
        this.drinkList.add(drink);
    }
}
