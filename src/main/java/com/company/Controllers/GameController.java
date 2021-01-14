package com.company.Controllers;

import com.company.Models.Die;
import com.company.Models.Player;
import com.company.Views.BoardGUI;
import gui_main.GUI;

import java.awt.*;

public class GameController {

    public Player[] player;
    private GUI gui;
    private String maxPlayers;
    BoardGUI boardGUI = new BoardGUI();

    public GameController() {

        gui = new GUI(boardGUI.guiFieldsConvert(BoardGUI.fields));
        setUpPlayers();
        //this.gui = gui;
        //GUI gui
    }
    public void startGame(){

        while (true){
            rolleDice();
        }

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




    Die die = new Die(1,6);
    int playerID =1;
    int sumOfValues;
    public int PlayerTurn(){
        playerID++;
        playerID %= player.length;
        return playerID;
    }

    public void rolleDice(){
        int valueOne = die.rollDice();
        int valuetow = die.rollDice();
        sumOfValues = valueOne + valuetow;

        String choose = gui.getUserSelection("Vil du kast terninger", "Ja","Nej");

        switch (choose){
            case "Ja":
                gui.setDice(valueOne, valuetow);
                updatePlayerPosition();
                break;
            case "Nej":
                return;
        }




    }


    public void updatePlayerPosition(){

        int playerTurn = PlayerTurn();


        gui.getFields()[player[playerTurn].getPlayerPosition()].setCar(player[playerTurn].getGui_player(),false);
        int newPosition = (player[playerTurn].getPlayerPosition() + sumOfValues) % gui.getFields().length;
        player[playerTurn].setPlayerPosition(newPosition);


        gui.getFields()[newPosition].setCar(player[playerTurn].getGui_player(),true);

    }


}
