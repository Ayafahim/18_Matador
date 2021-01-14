package com.company;

import com.company.Controllers.GameController;
import com.company.Models.Fields.Brewery;
import com.company.Models.Fields.Field;
import com.company.Models.Player;
import com.company.Views.BoardGUI;
import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class Ownable extends Field {

    public GUI_Ownable ownable;
    int price;
    public Player owner;


    public Ownable(String name, int price, Color bgColor, Color fgColor) {
        super(name, bgColor, fgColor);
        price = price;
    }



  /*  @Override
    public void landOnField(Player player, GUI gui) {
        super.landOnField(player, gui);
        if (player ==  owner){
            gui.showMessage(player + " ejer allerede grunden.");
        }
        else if (owner == null){
            if (gui.getUserLeftButtonPressed("Vil du købe denne grund?","Ja","Nej")) {
                if(player.gui_player.getBalance() >= price){
                    this.owner = player;
                    player.gui_player.setBalance(-price);
                    gui.showMessage("Du ejer nu grunden");
                }
            }
            else {
                gui.showMessage("Grunden er stadig til salg.");
            }
        }
        else if (player != owner){
            gui.showMessage("Grunden er allerede ejet");
        }
        else{
            gui.showMessage("Du har ikke nok penge");

        }
    }

   */
}
