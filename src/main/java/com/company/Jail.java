package com.company;

import java.awt.*;

public class Jail extends Field {

    int jailFee;

    public Jail(String name, Color bgColor, Color fgColor, int jailFee) {
        super(name, bgColor, fgColor);
        this.jailFee = jailFee;
    }
}

