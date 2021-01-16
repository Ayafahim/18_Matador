package com.company.Models.Fields;

import com.company.Models.Player;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;

public abstract class Field {

    String name;
    Color bgColor, fgColor;


    public Field(String name, Color bgColor, Color fgColor){
        this.name = name;
        this.bgColor = bgColor;
        this.fgColor = fgColor;
    }

    public void setName(String name) {

        this.name = name;
    }

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


    public Class landOnField(){
        return this.getClass();
    }


}
