package com.company.Views;

import com.company.*;
import gui_main.GUI;



public class BoardGUI {

    public static void main(String[] args) {
        Field[] fields = {
                new Street("Rødovrevej","1.200KR",1200),
                new Street("Hvidovrevej","1.200KR",1200),
                new Street("Rodskildevej","2.000KR",2000),
                new Street("Valby Langgade","2.000KR",2000),
                new Street("Allégade","2.400KR",2400),
                new Street("Frederiksberg Allé","2.800KR",2800),
                new Street("Bülowsvej","2800KR",2800),
                new Street("Gl.Kongevej","3.200KR",3200),
        };


        GUI board = new GUI();
    }

}

