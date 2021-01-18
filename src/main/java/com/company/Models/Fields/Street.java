package com.company.Models.Fields;

import java.awt.*;

public class Street extends Field {

    int price, rent1;
    String subText;
    boolean hasOwner;


    public Street(String name, String subText, int price, Color bgColor, Color fgColor, int rent1) {
        super(name, bgColor, fgColor);
        this.subText = subText;
        this.price = price;
        this.rent1 = rent1;
        hasOwner = false;
    }

    public boolean getOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public int getPrice() {
        return price;
    }

    public int getRent1() {
        return rent1;
    }

    public void setRent1(int rent1) {
        this.rent1 = rent1;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getSubText() {
        return subText;
    }


}


