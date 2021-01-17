package com.company;

import com.company.Controllers.GameController;
import com.company.Views.BoardGUI;
import com.company.helper.ConvertHelper;
import gui_main.GUI;

public class Main {
    public static void main(String[] args) {

        GameController game = new GameController(new GUI(ConvertHelper.guiFieldConvert(BoardGUI.fields)));

        game.game();


    }

}

