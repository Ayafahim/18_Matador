package com.company;
/*package com.company;

import com.company.Controllers.GameController;
import com.company.Views.BoardGUI;

public class Main {

    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.setupGame();
    }

}

 */

import com.company.Controllers.GameController;
import com.company.Models.Fields.Field;
import com.company.Views.BoardGUI;
import gui_main.GUI;

public class Main {



    public static void main(String[] args) {


        GameController game = new GameController( );
        //new  BoardGUI.guiFieldsConvert(BoardGUI.fields)

        game.startGame();

    }

}

