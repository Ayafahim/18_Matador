package com.company;


import com.company.Models.Player;

import java.awt.*;

public class Parking extends Field{

    String subText;

    public Parking(String name, String subText, Color bgColor, Color fgColor) {
        super(name, bgColor, fgColor);
        this.subText = subText;
    }

    void setsubText(String subText) {
        this.subText = subText;
    }
    String getsubText(){
        return subText;
    }
    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getSubText() {
        return subText;
    }



}

