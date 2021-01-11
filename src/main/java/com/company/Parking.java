package com.company;

import com.company.Models.Player;

public class Parking extends Field{

    String subText;

    public Parking(String name,String subText) {
        super(name);
        subText = subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getSubText() {
        return subText;
    }

    @Override
    public void landOnField(Player player) {
        super.landOnField(player);
        System.out.println("Det er sker intet");
    }
}

