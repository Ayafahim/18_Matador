package com.company.Models.Fields;

import com.company.Models.Player;

import java.awt.*;

public class Brewery extends Field {

    int price;
    String subText;
    boolean hasOwner;
    public int rent;

    public Brewery(String name, String subText, int price,int rent, Color bgColor, Color fgColor) {
        super(name, bgColor, fgColor);
        this.subText = subText;
        this.price = price;
        hasOwner = false;
        rent = rent;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getSubText() {
        return subText;
    }

    public int getPrice() {
        return price;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }


}
