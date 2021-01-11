package com.company;

public class Tax extends Field {

    int taxFee;


    public Tax(String name, int taxFee) {
        super(name);
        this.taxFee = taxFee;
    }
}
