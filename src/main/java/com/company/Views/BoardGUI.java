package com.company.Views;

import com.company.Models.Fields.*;
import gui_fields.*;

import java.awt.*;


public class BoardGUI {


        public static Field[] fields = {
                new Start("Start", Color.RED, Color.BLACK,4000, "Modtag kr. 4000"),
                new Street("Rødovrevej","1.200KR",1200, Color.blue,Color.BLACK),
                new Chance("Prøv lykken",Color.BLACK,Color.GREEN),
                new Street("Hvidovrevej","1.200KR",1200,Color.blue,Color.BLACK),
                new Tax("Skat",Color.cyan,Color.BLACK,4000,"betal"),
                new Fleet("Scandilines","Færge",4000,Color.BLUE,Color.BLACK),
                new Street("Rodskildevej","2.000KR",2000,Color.ORANGE,Color.BLACK),
                new Chance("Prøv lykken",Color.BLACK,Color.GREEN),
                new Street("Valby Langgade","2.000KR",2000,Color.ORANGE,Color.BLACK),
                new Street("Allégade","2.400KR",2400,Color.ORANGE,Color.BLACK),
                new Jail("På Besøg", Color.BLACK,Color.WHITE, 0),
                new Street("Frederiksberg Allé","2.800KR",2800,Color.cyan,Color.BLACK),
                new Brewery("Turborg Squash", "3.000KR",3000, Color.CYAN, Color.BLACK),
                new Street("Bülowsvej","2.800KR",2800,Color.cyan,Color.BLACK),
                new Street("Gl.Kongevej","3.200KR",3200,Color.cyan,Color.BLACK),
                new Fleet("Mols-Linien","4.000kr",4000,Color.RED,Color.BLACK),
                new Street("Bernstorttsvej","3.600KR",3600,Color.GRAY,Color.BLACK),
                new Chance("Prøv lykken",Color.BLACK,Color.GREEN),
                new Street("Hellerupvej","3.600KR",3600,Color.GRAY,Color.BLACK),
                new Street("Strandvejen","4000KR",4000,Color.GRAY,Color.BLACK),
                new Parking("Parking","Gør noget ved dine drømme", Color.BLUE,Color.BLACK),
                new Street("Trianglen","4.400KR",4400,Color.RED,Color.BLACK),
                new Chance("Prøv lykken",Color.BLACK,Color.GREEN),
                new Street("Østerbrogade","4.400KR",4400,Color.RED,Color.BLACK),
                new Street("Grønningen","4.800KR",4800,Color.RED,Color.BLACK),
                new Fleet("Scandlines","4.000KR",4000,Color.BLUE,Color.BLACK),
                new Street("Bredgade","5.200KR",5200,Color.WHITE,Color.BLACK),
                new Street("Kgs.Nytorv","5.200KR",5200,Color.white,Color.BLACK),
                new Brewery("Coca cola","3.000KR",3000,Color.RED,Color.BLACK),
                new Street("Østergade","5.600KR",5600,Color.white,Color.BLACK),
                new Jail("De fængsles",Color.black,Color.white,1000),
                new Street("Amagertorv","6.000KR",6000,Color.YELLOW,Color.BLACK),
                new Street("Vimmelskattet","6.000KR",6000,Color.YELLOW,Color.BLACK),
                new Chance("Prøv lykken",Color.BLACK,Color.GREEN),
                new Street("Nygade","6.400KR",6400,Color.YELLOW,Color.BLACK),
                new Fleet("Scandlines","4.000KR",4000,Color.BLUE,Color.BLACK),
                new Chance("Prøv lykken",Color.BLACK,Color.GREEN),
                new Street("Fredriksberggade","7000KR",7000,Color.MAGENTA,Color.BLACK),
                new Tax("Ekstra ordinær Statskat",Color.BLUE,Color.BLACK,2000,"2000KR"),
                new Street("Rådhuspladsen","8.000KR",8000,Color.MAGENTA,Color.BLACK),
        };





     public static GUI_Field[] guiFieldsConvert(Field[] fields){
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
            else if (fields[i] instanceof Start){
                gui_fields[i] = new GUI_Start();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());
            }
            else if (fields[i] instanceof Jail){
                gui_fields[i] = new GUI_Jail();
                gui_fields[i].setTitle(fields[i].getName());
                gui_fields[i].setSubText(gui_fields[i].getSubText());
                gui_fields[i].setBackGroundColor(fields[i].getBgColor());
                gui_fields[i].setForeGroundColor(fields[i].getFgColor());

            }


        }
        return gui_fields;

    }

}

