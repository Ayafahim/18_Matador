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



    public void setUpPlayers(){

        maxPlayers = gui.getUserSelection("vælg antal spillere","2","3","4","5","6");
        player = new Player[Integer.parseInt(maxPlayers)];
        for(int i = 0; i < player.length; i++){
            player[i] = new Player(gui, Color.cyan);
            gui.addPlayer(player[i].getGui_player());
            gui.getFields()[0].setCar(player[i].getGui_player(),true);
        }

    }

}
