package com.company;

import java.awt.*;

public class Fleet extends Field {

    int Price;
    String subText;

    public Fleet(String name, String subText, int price, Color bgColor, Color fgColor) {
        super(name, bgColor, fgColor);
        this.Price = Price;
        this.subText = subText;
    }



    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getSubText() {
        return subText;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;

    }



}
