package com.company;

public class DrinkButton {
    private boolean lightStatus;

    public boolean getLightStatus() {
        return lightStatus;
    }

    public boolean setLightStatus(Boolean status) { return this.lightStatus = status; }

    public String pushButton() {
        return "Insufficient funds for this item";
    }
}
