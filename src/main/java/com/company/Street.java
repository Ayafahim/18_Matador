package com.company;

public class Street extends Field{

    int price;
    String subText;

    public Street(String name, String subText,int price) {
        super(name);
        this.subText = subText;
        this.price = price;
    }

}
