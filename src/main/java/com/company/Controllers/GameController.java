package com.company.Controllers;

import com.company.Main;
import com.company.Models.Die;
import com.company.Models.Fields.Field;
import com.company.Models.Fields.Street;
import com.company.Models.Player;
import com.company.Ownable;
import com.company.Views.BoardGUI;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;
import java.util.function.ToDoubleBiFunction;

import static java.lang.Thread.sleep;

public class GameController {

    public Player[] player;
    public GUI gui;
    private String maxPlayers;
    private int turn = 1;
    Die die1 = new Die(1, 6);
    Die die2 = new Die(1, 6);
    boolean isPlaying = true;
    Player owner;

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

    public void calculatePlayerTurn() {
        if (player.length == 2) {
            while (true) {
                switch (turn) {
                    case 1:
                        movePlayer(player[0]);
                       // buyProperty(player[0]);
                        turn = 2;
                        System.out.println(turn);
                        break;
                    case 2:
                        turn = 1;
                        movePlayer(player[1]);
                       // buyProperty(player[1]);
                        System.out.println(turn);
                        break;

                }
            }

        }
        if (player.length == 3) {
            switch (turn) {
                case 1:
                    turn = 2;

                    break;
                case 2:
                    turn = 3;
                    break;
                case 3:
                    turn = 1;

            }
        }
        if (player.length == 4) {
            switch (turn) {
                case 1:
                    turn = 2;
                    break;
                case 2:
                    turn = 3;
                    break;
                case 3:
                    turn = 4;
                    break;
                case 4:
                    turn = 1;
                    break;
            }

        }
        if (player.length == 5) {
            switch (turn) {
                case 1:
                    turn = 2;
                    break;
                case 2:
                    turn = 3;
                    break;
                case 3:
                    turn = 4;
                    break;
                case 4:
                    turn = 5;
                    break;
                case 5:
                    turn = 1;
                    break;
            }

        }
        if (player.length == 6) {
            switch (turn) {
                case 1:
                    turn = 2;
                    break;
                case 2:
                    turn = 3;
                    break;
                case 3:
                    turn = 4;
                    break;
                case 4:
                    turn = 5;
                    break;
                case 5:
                    turn = 6;
                    break;
                case 6:
                    turn = 1;
                    break;
            }

        }
    }


    public void movePlayer(Player player) {
        gui.showMessage(player.getName() + "'s tur.");
        String slåKnap = gui.getUserSelection("Tryk på slå, eller enter for at slå terningerne", new String("Slå!"));

        if (slåKnap.equals("Slå!")) {
            int sum = die1.diceTurn(die1) + die2.diceTurn(die2);
            gui.setDice(die1.diceNumber, die1.diceNumber);

            gui.getFields()[player.playerPosition].setCar(player.gui_player, false);
            player.playerPosition += sum;
            if (player.playerPosition >= BoardGUI.fields.length) {
                player.playerPosition -= BoardGUI.fields.length;
            }
            gui.getFields()[player.playerPosition].setCar(player.gui_player, true);
            landOnField(BoardGUI.fields[player.playerPosition],player);



        }
    }

   /* public void buyProperty(Player player) {
        if (player.playerPosition == 6) {
            landOnField(BoardGUI.fields[],player);
        }

    }

    */

    public void landOnField(Field field, Player player) {
        if (field instanceof Street) {
            if (((Street) field).getOwner()== false) {
                if(gui.getUserLeftButtonPressed("Vil du købe denne grund?", "Ja", "Nej")) {
                    ((Street) field).setHasOwner(true);
                    player.gui_player.setBalance(player.gui_player.getBalance()-((Street) field).getPrice());
                    player = owner;
                }
                else {
                    ((Street) field).setHasOwner(false);
                }
            } else {
                gui.showMessage("feltet er allerede ejet.");
            }
        }
    }
}










