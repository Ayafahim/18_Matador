package com.company;

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


    /* public void landOnField(Player player){
        System.out.println(player +" er landet");
    }


*/

}
