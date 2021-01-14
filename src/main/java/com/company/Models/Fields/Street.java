package com.company.Models.Fields;

//import com.company.Models.Player;

import java.awt.*;

public class Street extends Field {

    int price;
    String subText;
    boolean hasOwner;

    public Street(String name, String subText, int price,Color bgColor, Color fgColor) {
        super(name, bgColor, fgColor);
        this.subText = subText;
        this.price = price;
        hasOwner = false;
    }

    public boolean getOwner(){
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void setName(String name) {

        super.setName(name);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getSubText() {
        return subText;
    }


}


