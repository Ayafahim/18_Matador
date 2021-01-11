package com.company;

import com.company.Controllers.GameController;
import com.company.Views.BoardGUI;

public class Main {

    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.setupGame();
    }
}
