package com.company;

import com.company.Models.Player;

public class Tax extends Field {

    int taxFee;
    String subText;


    public Tax(String name, String subText,int taxFee) {
        super(name);
        this.subText = subText;
        this.taxFee = taxFee;
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

    @Override
    public void landOnField(Player player) {
        super.landOnField(player);
        System.out.println("Betal " + getTaxFee() + "KR");
    }

    public void payTaxFee(){

    }
}
