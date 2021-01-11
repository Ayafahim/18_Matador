package com.company;

public class Brewery extends Field {

    int price;
    String subText;


    public Brewery(String name, String subText,int price) {
        super(name);
        this.subText = subText;
        this.price = price;
    }
}
