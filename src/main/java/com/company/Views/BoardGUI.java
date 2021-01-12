package com.company.Views;

import com.company.*;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;


public class BoardGUI {

    public static void main(String[] args) {
        Field[] fields = {
                new Street("Rødovrevej","1.200KR",1200, Color.cyan,Color.BLACK),
                new Street("Hvidovrevej","1.200KR",1200,Color.cyan,Color.BLACK),
                new Street("Rodskildevej","2.000KR",2000,Color.cyan,Color.BLACK),
                new Street("Valby Langgade","2.000KR",2000,Color.cyan,Color.BLACK),
                new Street("Allégade","2.400KR",2400,Color.cyan,Color.BLACK),
                new Street("Frederiksberg Allé","2.800KR",2800,Color.cyan,Color.BLACK),
                new Street("Bülowsvej","2800KR",2800,Color.cyan,Color.BLACK),
                new Street("Gl.Kongevej","3.200KR",3200,Color.cyan,Color.BLACK),
        };


        GUI board = new GUI(guiFieldsConvert(fields));
    }

     private static GUI_Field[] guiFieldsConvert(Field[] fields){
        GUI_Field[] gui_fields = new GUI_Field[fields.length];
        for (int i = 0; i < fields.length; i++){
            if (fields[i] instanceof Street){
                gui_fields[i] = new GUI_Street();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setSubText(((Street) fields[i]).getSubText());
                gui_fields[i].setBackGroundColor(((Street) fields[i]).getBgColor());
                gui_fields[i].setForeGroundColor(((Street) fields[i]).getFgColor());
            }
            else if(fields[i] instanceof Brewery ){
                gui_fields[i] = new GUI_Brewery();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setSubText(((Brewery) fields[i]).getSubText());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            }
            else if (fields[i] instanceof Chance){
                gui_fields[i] = new GUI_Chance();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            }
            else if(fields[i] instanceof Fleet){
                gui_fields[i] = new GUI_Shipping();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setSubText(((Fleet) fields[i]).getSubText());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            }
            else if(fields[i] instanceof Tax){
                gui_fields[i] = new GUI_Tax();
                gui_fields[i].setTitle(((Tax) fields[i]).getName());
                gui_fields[i].setSubText(((Tax) fields[i]).getSubText());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            }
            else if(fields[i] instanceof Parking){
                gui_fields[i] = new GUI_Refuge();
                gui_fields[i].setTitle(((Parking) fields[i]).getName());
                gui_fields[i].setSubText(((Parking) fields[i]).getSubText());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            }


        }
        return gui_fields;

    }

}

