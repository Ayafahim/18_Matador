package com.company.Models.Fields;

import java.awt.*;

public class Jail extends Field {

    int jailFee;
    String subText;


    public Jail(String name, Color bgColor, Color fgColor, String subText, int jailFee) {
        super(name, bgColor, fgColor);
        this.jailFee = jailFee;
    }

    public void setJailFee (int jailFee){
        this.jailFee = jailFee;

    }
    public void setSubText(String subText){
        this.subText = subText;
    }

    public int getJailFee(){
        return jailFee;
    }

    public String getSubText(){
        return subText;
    }

}

