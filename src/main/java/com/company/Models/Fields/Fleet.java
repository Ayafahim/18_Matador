package com.company.Models.Fields;

import com.company.Controllers.GameController;
import com.company.Models.Player;

import java.awt.*;

public class Fleet extends Field {

    int Price,fleet1,fleet2,fleet3,fleet4;
    String subText;
    boolean hasOwner;

    public Fleet(String name, String subText, int Price, Color bgColor, Color fgColor) {
        super(name, bgColor, fgColor);
        this.Price = Price;
        this.subText = subText;
        hasOwner = false;
        fleet1 = 500;
        fleet2 = 1000;
        fleet3 = 2000;
        fleet4 = 4000;
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

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public int getFleet1() {
        return fleet1;
    }

    public void setFleet1(int fleet1) {
        this.fleet1 = fleet1;
    }

    public int getFleet2() {
        return fleet2;
    }

    public void setFleet2(int fleet2) {
        this.fleet2 = fleet2;
    }

    public int getFleet3() {
        return fleet3;
    }

    public void setFleet3(int fleet3) {
        this.fleet3 = fleet3;
    }

    public int getFleet4() {
        return fleet4;
    }

    public void setFleet4(int fleet4) {
        this.fleet4 = fleet4;
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


