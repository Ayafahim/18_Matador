package com.company.Models.Fields;

import java.awt.*;

public class Street extends Field {

    int price, rent1, rent2, rent3, rent4, rent5, rent6;
    String subText;
    boolean hasOwner;

    public Street(String name, String subText, int price, Color bgColor, Color fgColor, int rent1, int rent2, int rent3, int rent4, int rent5, int rent6) {
        super(name, bgColor, fgColor);
        this.subText = subText;
        this.price = price;
        this.rent1 = rent1;
        this.rent2 = rent2;
        this.rent3 = rent3;
        this.rent4 = rent4;
        this.rent5 = rent5;
        this.rent6 = rent6;
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

    public int getRent2() {
        return rent2;
    }

    public void setRent2(int rent2) {
        this.rent2 = rent2;
    }

    public int getRent3() {
        return rent3;
    }

    public void setRent3(int rent3) {
        this.rent3 = rent3;
    }

    public int getRent4() {
        return rent4;
    }

    public void setRent4(int rent4) {
        this.rent4 = rent4;
    }

    public int getRent5() {
        return rent5;
    }

    public void setRent5(int rent5) {
        this.rent5 = rent5;
    }

    public void setRent6(int rent6) {
        this.rent6 = rent6;
    }

    public int getRent6() {
        return rent6;
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


