package com.company.Models.Fields;

import java.awt.*;

public class JailVisit extends Field {

    String subText;

    public JailVisit(String name, String subText, Color bgColor, Color fgColor) {
        super(name, bgColor, fgColor);
        subText = subText;

    }
    public String getSubText() {
        return subText;
    }
    public void setSubText(String subText) {
        this.subText = subText;
    }

}
