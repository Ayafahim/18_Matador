package com.company;

import java.awt.*;

public class Brewery extends Field {

    int price;
    String subText;

    public Brewery(String name, String subText, int price, Color bgColor, Color fgColor) {
        super(name, bgColor, fgColor);
        this.subText = subText;
        this.price = price;
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
