package com.company.Models.Fields;

import java.awt.*;

public abstract class Field {// det er en abstra

    String name;
    Color bgColor, fgColor;


    public Field(String name, Color bgColor, Color fgColor) {// konstruktør
        this.name = name;
        this.bgColor = bgColor;
        this.fgColor = fgColor;
    }

    public void setName(String name) {
        this.name = name;
    }// get metoder du henter den og set du ændre dem.

    public String getName() {
        return name;
    }

    public Color getFgColor() {
        return fgColor;
    }

    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }

    public Color getBgColor() {
        return bgColor;
    }

    public void setFgColor(Color fgColor) {
        this.fgColor = fgColor;
    }


    public Class landOnField() {
        return this.getClass();
    }


}
