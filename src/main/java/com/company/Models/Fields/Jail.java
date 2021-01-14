package com.company.Models.Fields;

import java.awt.*;

public class Jail extends Field {




    int jailFee;


    public Jail(String name, Color bgColor, Color fgColor, int jailFee) {
        super(name, bgColor, fgColor);
        this.jailFee = jailFee;
    }

    void setJailFee (int jailFee){
        this.jailFee = jailFee;

    }

    public int getJailFee(){
        return jailFee;
    }


}

