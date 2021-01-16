package com.company.Controllers;

import com.company.Models.Die;
import com.company.Models.Fields.Brewery;
import com.company.Models.Fields.Field;
import com.company.Models.Fields.Fleet;
import com.company.Models.Fields.Street;
import com.company.Models.Player;
import com.company.Views.BoardGUI;
import gui_fields.GUI_Ownable;
import gui_main.GUI;

import java.awt.*;

public class GameController {

    public Player[] player;
    public GUI gui;
    private String maxPlayers;
    private int turn = 1;
    Die die1 = new Die(1, 6);
    Die die2 = new Die(1, 6);
    boolean isPlaying = true;
    public Player owner;

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
                        turn = 2;
                        break;
                    case 2:
                        turn = 1;
                        movePlayer(player[1]);
                        break;

                }
            }

        }
        if (player.length == 3) {
            while (true) {
                switch (turn) {
                    case 1:
                        movePlayer(player[0]);
                        turn = 2;
                        break;
                    case 2:
                        movePlayer(player[1]);
                        turn = 3;
                        break;
                    case 3:
                        movePlayer(player[2]);
                        turn = 1;
                }
            }
        }
        if (player.length == 4) {
            while (true) {
                switch (turn) {
                    case 1:
                        turn = 2;
                        movePlayer(player[0]);
                        break;
                    case 2:
                        turn = 3;
                        movePlayer(player[1]);
                        break;
                    case 3:
                        turn = 4;
                        movePlayer(player[2]);
                        break;
                    case 4:
                        turn = 1;
                        movePlayer(player[3]);
                        break;
                }
            }

        }
        if (player.length == 5) {
            while (true) {
                switch (turn) {
                    case 1:
                        turn = 2;
                        movePlayer(player[0]);
                        break;
                    case 2:
                        turn = 3;
                        movePlayer(player[1]);
                        break;
                    case 3:
                        turn = 4;
                        movePlayer(player[2]);
                        break;
                    case 4:
                        turn = 5;
                        movePlayer(player[3]);
                        break;
                    case 5:
                        turn = 1;
                        movePlayer(player[4]);
                        break;
                }
            }

        }
        if (player.length == 6) {
            while (true) {
                switch (turn) {
                    case 1:
                        turn = 2;
                        movePlayer(player[0]);
                        break;
                    case 2:
                        turn = 3;
                        movePlayer(player[1]);
                        break;
                    case 3:
                        turn = 4;
                        movePlayer(player[2]);
                        break;
                    case 4:
                        turn = 5;
                        movePlayer(player[3]);
                        break;
                    case 5:
                        turn = 6;
                        movePlayer(player[4]);
                        break;
                    case 6:
                        turn = 1;
                        movePlayer(player[5]);
                        break;
                }
            }
        }
    }


    public void movePlayer(Player player) {
        gui.showMessage(player.getName() + "'s tur.");
        String playButton = gui.getUserSelection("Tryk på slå, eller enter for at slå terningerne", new String("Slå!"));

        if (playButton.equals("Slå!")) {
            int sum = die1.diceTurn(die1) + die2.diceTurn(die2);
            gui.setDice(die1.diceNumber, die1.diceNumber);

            gui.getFields()[player.playerPosition].setCar(player.gui_player, false);
            player.playerPosition += sum;
            if (player.playerPosition >= BoardGUI.fields.length) {
                player.playerPosition -= BoardGUI.fields.length;
            }
            gui.getFields()[player.playerPosition].setCar(player.gui_player, true);
            landOnField(BoardGUI.fields[player.playerPosition], player);
        }
    }

    public void landOnField(Field field, Player player) {
        if (field instanceof Street) {
            if (!((Street) field).getOwner()) {
                if (gui.getUserLeftButtonPressed("Vil du købe denne grund?", "Ja", "Nej")) {
                    ((Street) field).setHasOwner(true);
                    player.gui_player.setBalance(player.gui_player.getBalance() - ((Street) field).getPrice());
                    owner = player;
                    owner.setOwnedStreets();
                    // Sæt border til players navn
                    GUI_Ownable ownable = (GUI_Ownable) gui.getFields()[player.playerPosition];
                    ownable.setBorder(owner.gui_player.getPrimaryColor());
                    // På owner sæt hvilken farve du har købt
                    //owner.setOwnedStreetColors(field.getBgColor());

                    //lav en metode der kaldes denne funkalitet når du skal købe hus

                   // for (Color color : owner.getOwnedStreetColors()) {

                   // }


                } else {
                    ((Street) field).setHasOwner(false);
                }
            } else {
                gui.showMessage("feltet er allerede ejet.");
                if (player != owner) {
                    payRentStreet(BoardGUI.fields[player.playerPosition], player);
                } else {
                    gui.showMessage("Du ejer allerede feltet.");
                }
            }
        } else if (field instanceof Brewery) {
            if (!((Brewery) field).isHasOwner()) {
                if (gui.getUserLeftButtonPressed("Vil du købe dette bryggeri?", "Ja", "Nej")) {
                    ((Brewery) field).setHasOwner(true);
                    player.gui_player.setBalance(player.gui_player.getBalance() - ((Brewery) field).getPrice());
                    owner = player;
                    owner.setOwnedBrewerys();
                    GUI_Ownable ownable = (GUI_Ownable) gui.getFields()[player.playerPosition];
                    ownable.setBorder(owner.gui_player.getPrimaryColor());
                } else {
                    ((Brewery) field).setHasOwner(false);
                }
            } else {
                gui.showMessage("Bryggeriet er allerede ejet.");
            }
        } else if (field instanceof Fleet) {
            if (((Fleet) field).isHasOwner() == false) {
                if (gui.getUserLeftButtonPressed("Vil du købe denne færge?", "Ja", "Nej")) {
                    ((Fleet) field).setHasOwner(true);
                    player.gui_player.setBalance(player.gui_player.getBalance() - ((Fleet) field).getPrice());
                    owner = player;
                    owner.setOwnedFleets();
                    GUI_Ownable ownable = (GUI_Ownable) gui.getFields()[player.playerPosition];
                    ownable.setBorder(owner.gui_player.getPrimaryColor());
                } else {
                    ((Fleet) field).setHasOwner(false);
                }
            } else {
                gui.showMessage("Færgen er allerede ejet.");
                if (player != owner) {
                    payRentFleet(BoardGUI.fields[player.playerPosition], player);
                } else {
                    gui.showMessage("Du ejer allerede feltet.");
                }
            }
        }

    }

    //Metode som sørger for at spillerene kan betale leje for Street
    public void payRentStreet(Field field, Player player) {
        if (field instanceof Street) {
            gui.showMessage("Du skal betale " + ((Street) field).getRent1() + "KR, til " + owner.gui_player.getName());
            if (player.gui_player.getBalance() >= ((Street) field).getRent1()) {
                player.gui_player.setBalance(player.gui_player.getBalance() - ((Street) field).getRent1());
                owner.gui_player.setBalance(owner.gui_player.getBalance() + ((Street) field).getRent1());
            } else {
                gui.showMessage("Du har ikke nok penge til at betale ejeren.");
            }

        }
    }

    //holder øje med hvor mange færger spilleren har så lejen ændre sig
    public void payRentFleet(Field field, Player player) {
        if (field instanceof Fleet) {
            switch (owner.getOwnedFleets()) {
                case 1:
                    if (player.gui_player.getBalance() >= ((Fleet) field).getFleet1()) {
                        gui.showMessage("Du skal betale " + ((Fleet) field).getFleet1() + "KR, til " + owner.gui_player.getName() + ". Da Spilleren kun ejer 1 færge.");
                        player.gui_player.setBalance(player.gui_player.getBalance() - ((Fleet) field).getFleet1());
                        owner.gui_player.setBalance(owner.gui_player.getBalance() + (((Fleet) field).getFleet1()));
                    } else {
                        gui.showMessage("Du har ikke nok penge til at betale ejeren.");
                    }
                    break;
                case 2:
                    if (player.gui_player.getBalance() >= ((Fleet) field).getFleet2()) {
                        gui.showMessage("Du skal betale " + ((Fleet) field).getFleet2() + "KR, til " + owner.gui_player.getName() + ". Da Spilleren ejer 2 færger.");
                        player.gui_player.setBalance(player.gui_player.getBalance() - ((Fleet) field).getFleet2());
                        owner.gui_player.setBalance(owner.gui_player.getBalance() + (((Fleet) field).getFleet2()));
                    } else {
                        gui.showMessage("Du har ikke nok penge til at betale ejeren.");
                    }
                    break;
                case 3:
                    if (player.gui_player.getBalance() >= ((Fleet) field).getFleet3()) {
                        gui.showMessage("Du skal betale " + ((Fleet) field).getFleet3() + "KR, til " + owner.gui_player.getName() + ". Da Spilleren ejer 3 færger.");
                        player.gui_player.setBalance(player.gui_player.getBalance() - ((Fleet) field).getFleet3());
                        owner.gui_player.setBalance(owner.gui_player.getBalance() + (((Fleet) field).getFleet3()));
                    } else {
                        gui.showMessage("Du har ikke nok penge til at betale ejeren.");
                    }
                    break;
                case 4:
                    if (player.gui_player.getBalance() >= ((Fleet) field).getFleet4()) {
                        gui.showMessage("Du skal betale " + ((Fleet) field).getFleet4() + "KR, til " + owner.gui_player.getName() + ". Da Spilleren ejer 4 færger.");
                        player.gui_player.setBalance(player.gui_player.getBalance() - ((Fleet) field).getFleet4());
                        owner.gui_player.setBalance(owner.gui_player.getBalance() + (((Fleet) field).getFleet4()));
                    } else {
                        gui.showMessage("Du har ikke nok penge til at betale ejeren.");
                    }
            }


        }

    }
}










