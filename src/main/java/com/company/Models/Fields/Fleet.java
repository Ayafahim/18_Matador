package com.company.Models.Fields;

import java.awt.*;

public class Fleet extends Field {

    int Price;
    String subText;

    public Fleet(String name, String subText, int Price, Color bgColor, Color fgColor) {
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

    @Override
    public Color getBgColor() {
        return super.getBgColor();
    }

    @Override
    public Color getFgColor() {
        return super.getFgColor();
    }

    public void setPrice(int price) {
        Price = price;

    }



}


