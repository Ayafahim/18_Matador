package com.company;

import java.awt.*;

public class Start extends Field {

    String subText;
    int Profit = 4000;

    public Start(String name, Color bgColor, Color fgColor, String subText, int Profit) {
        super(name, bgColor, fgColor);
        this.subText = subText;
        this.Profit = Profit;
    }
    void setSubText (String subText) {
        this.subText = subText;

    }

    void setProfit (int profit){
        this.Profit = Profit;

    }
    String getSubText(){
        return subText;
    }
    int getProfit(){
        return Profit;
    }


}
