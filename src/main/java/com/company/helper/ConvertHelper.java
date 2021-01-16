package com.company.helper;

import com.company.Models.Fields.*;
import gui_fields.*;

public class ConvertHelper {
    public static GUI_Field[] guiFieldConvert(Field[] fields) {
        GUI_Field[] gui_fields = new GUI_Field[fields.length];
        for (int i = 0; i < fields.length; i++) {
            if (fields[i] instanceof Street) {
                gui_fields[i] = new GUI_Street();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setSubText(((Street) fields[i]).getSubText());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            } else if (fields[i] instanceof Brewery) {
                gui_fields[i] = new GUI_Brewery();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setSubText(((Brewery) fields[i]).getSubText());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            } else if (fields[i] instanceof Chance) {
                gui_fields[i] = new GUI_Chance();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            } else if (fields[i] instanceof Fleet) {
                gui_fields[i] = new GUI_Shipping();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setSubText(((Fleet) fields[i]).getSubText());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            } else if (fields[i] instanceof Tax) {
                gui_fields[i] = new GUI_Tax();
                gui_fields[i].setTitle(((Tax) fields[i]).getName());
                gui_fields[i].setSubText(((Tax) fields[i]).getSubText());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            } else if (fields[i] instanceof Parking) {
                gui_fields[i] = new GUI_Refuge();
                gui_fields[i].setTitle(((Parking) fields[i]).getName());
                gui_fields[i].setSubText(((Parking) fields[i]).getSubText());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            } else if (fields[i] instanceof Start) {
                gui_fields[i] = new GUI_Start();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            } else if (fields[i] instanceof Jail) {
                gui_fields[i] = new GUI_Jail();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setSubText(((Jail) fields[i]).getSubText());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            }
        }
        return gui_fields;
    }
}
