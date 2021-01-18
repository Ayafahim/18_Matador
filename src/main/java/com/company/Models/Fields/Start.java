package com.company.Models.Fields;

import java.awt.*;

public class Start extends Field {

    String subText;
    // Giv 4k når over ny start field = start -> giv player 4k
    int Profit;

    public Start(String name, Color bgColor, Color fgColor, int Profit, String subText) {
        super(name, bgColor, fgColor);
        this.subText = subText;
        this.Profit = Profit;
    }

    void setSubText(String subText) {
        this.subText = subText;

    }

    private void setProfit(int profit) {
        this.Profit = Profit;
    }

    String getSubText() {
        return subText;
    }

    public int getProfit() {
        return Profit;
    }


}
