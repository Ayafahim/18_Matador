package com.company.Controllers;

import com.company.Models.Player;
import com.company.Views.BoardGUI;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;

public class GameController {

    public Player[] player;
    private static GUI gui;
    private String maxPlayers;
    private boolean isPlaying = true;
    private int turn = 0;
    private int maxBalance = 0;

    public GameController(GUI gui) {
        this.gui = gui;
    }

    /* public void setupGame() {
      /* Tilføjer spillere alt efter hvor mange spillere man er vha. et for loop og sætter alle spillerne i en array.
           Hvis "i" tæller fra 0 og til op til fx max 2 spillere, så vil den forsøge at oprette 3 gendstande til array
           Derfor starter vi at tælle fra 1 og bagefter trækker 1 fra, da array starter med index 0
           Her bliver spillerne gemt i "players" array fra Player klassen

       for (int i = 1; i <= Player.BoardGUI.gui.getPlayerAmount(); i++) {
            String name = Player.boardGUI.getGui().getUserString("Hvad er dit navn");
            player = new Player(name, 0);
            player.getPlayers()[i - 1] = player;
            player.createPlayer();
        }
    }
    */

    public static GUI getGui() {
        return gui;
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

    private void playerTurnCalculate() {
        if (player.length == 2) {
            switch (this.turn) {
                case 0:
                    this.turn = 1;
                    // playerTurn() method here
                    break;
                case 1:
                    this.turn = 0;
                    // playerTurn() method here
                    break;
            }
        } else if (player.length == 3) {
            switch (this.turn) {
                case 0:
                    this.turn = 1;
                    // playerTurn() method here
                    break;
                case 1:
                    this.turn = 2;
                    // playerTurn() method here
                    break;
                case 2:
                    this.turn = 0;
                    // playerTurn() method here
                    break;
            }
        } else if (player.length == 4) {
            switch (this.turn) {
                case 0:
                    this.turn = 1;
                    // playerTurn() method here
                    break;
                case 1:
                    this.turn = 2;
                    // playerTurn() method here
                    break;
                case 2:
                    this.turn = 3;
                    // playerTurn() method here
                    break;
                case 3:
                    this.turn = 0;
                    // playerTurn() method here
                    break;
            }
        } else if (player.length == 5) {
            switch (this.turn) {
                case 0:
                    this.turn = 1;
                    // playerTurn() method here
                    break;
                case 1:
                    this.turn = 2;
                    // playerTurn() method here
                    break;
                case 2:
                    this.turn = 3;
                    // playerTurn() method here
                    break;
                case 3:
                    this.turn = 4;
                    // playerTurn() method here
                    break;
                case 4:
                    this.turn = 0;
                    // playerTurn() method here
                    break;
            }
        } else if (player.length == 6) {
            switch (this.turn) {
                case 0:
                    this.turn = 1;
                    // playerTurn() method here
                    break;
                case 1:
                    this.turn = 2;
                    // playerTurn() method here
                    break;
                case 2:
                    this.turn = 3;
                    // playerTurn() method here
                    break;
                case 3:
                    this.turn = 4;
                    // playerTurn() method here
                    break;
                case 4:
                    this.turn = 5;
                    // playerTurn() method here
                    break;
                case 5:
                    this.turn = 0;
                    // playerTurn() method here
                    break;
            }
        }
    }

    private void playerTurn(Player player) {

    }

    public void game() {
        setUpPlayers();
        while (isPlaying) {
            this.playerTurnCalculate();
            for(int i = 0; i < player.length; i++) {
                if(player[i].gui_player.getBalance() <= 0) {
                    gui.showMessage(player[i].gui_player.getName() + " har tabt...");

                    if(player[i].gui_player.getBalance() > player[maxBalance].gui_player.getBalance()) {
                        maxBalance = i;
                    }
                    gui.showMessage(player[maxBalance].gui_player.getName() + " har vundet!!!!");
                    this.isPlaying = false;
                    gui.close();
                }

            }
        }
    }

}
