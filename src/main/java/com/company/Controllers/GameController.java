package com.company.Controllers;

import com.company.Models.Player;
import com.company.Views.BoardGUI;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;

public class GameController {

    public Player[] player;
    private GUI gui;
    private String maxPlayers;

    public GameController(GUI gui) {
        this.gui = gui;
    }

    public void setUpPlayers() {

        maxPlayers = gui.getUserSelection("vælg antal spillere", "2", "3", "4", "5", "6");
        player = new Player[Integer.parseInt(maxPlayers)];
        for (int i = 0; i < player.length; i++) {
            String colors = gui.getUserSelection("Vælg en farve.", "Gul", "Rød", "Grøn", "Blå", "Hvid", "Sort");
            Color color = null;

            switch (colors) {
                case "Gul":
                    color = Color.YELLOW;
                    break;
                case "Rød":
                    color = Color.RED;
                    break;
                case "Grøn":
                    color = Color.GREEN;
                    break;
                case "Blå":
                    color = Color.BLUE;
                    break;
                case "Hvid":
                    color = Color.WHITE;
                    break;
                case "Sort":
                    color = Color.BLACK;
                    break;
                default:
                    color = Color.CYAN;
            }


            player[i] = new Player(gui, color);
            gui.addPlayer(player[i].getGui_player());
            gui.getFields()[0].setCar(player[i].getGui_player(), true);
        }

    }

}
