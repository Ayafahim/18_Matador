package com.company.Controllers;

import com.company.Models.Player;
import com.company.Views.BoardGUI;

public class GameController {

    private Player player;

    public void setupGame() {
        /* Tilføjer spillere alt efter hvor mange spillere man er vha. et for loop og sætter alle spillerne i en array.
           Hvis "i" tæller fra 0 og til op til fx max 2 spillere, så vil den forsøge at oprette 3 gendstande til array
           Derfor starter vi at tælle fra 1 og bagefter trækker 1 fra, da array starter med index 0
           Her bliver spillerne gemt i "players" array fra Player klassen */
        for (int i = 1; i <= Player.boardGUI.getPlayerAmount(); i++) {
            String name = Player.boardGUI.getGui().getUserString("Hvad er dit navn");
            player = new Player(name, 0);
            player.getPlayers()[i - 1] = player;
            player.createPlayer();
        }
    }
}
