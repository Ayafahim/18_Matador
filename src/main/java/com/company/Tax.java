package com.company;

//import com.company.Models.Player;

import java.awt.*;

public class Tax extends Field{

    int taxFee;
    String subText;

    public Tax(String name, Color bgColor, Color fgColor, int taxFee, String subText) {
        super(name, bgColor, fgColor);
        this.taxFee = taxFee;
        this.subText = subText;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public int getTaxFee() {
        return taxFee;
    }

    public void setTaxFee(int taxFee) {
        this.taxFee = taxFee;
    }

  /*  @Override
    public void landOnField(Player player) {
        super.landOnField(player);
        System.out.println("Betal " + getTaxFee() + "KR");
    }

    public void payTaxFee(){

    }

   */
}
