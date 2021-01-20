package com.company.Models;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class Player {

    private String name;
    public int playerPosition = 0;
    private int ownedBreweries;// gad ikke virker, så lavet det i game metoden istedet
    private int ownedFleets;
    public GUI_Player gui_player;

    public Player(GUI gui, Color color) {

        this.name = gui.getUserString("Skriv navn");
        GUI_Car car = new GUI_Car();
        car.setPrimaryColor(color);

        gui_player = new GUI_Player(name, 30000, car);
        gui.addPlayer(gui_player);
    }

    public String getName() {
        return name;
    }

    public void setOwnedBreweries() {
        this.ownedBreweries += 1;
    }

    public int getOwnedFleets() {
        return ownedFleets;
    }

    public void setOwnedFleets() {
        this.ownedFleets += 1;
    }

    public GUI_Player getGui_player() {
        return gui_player;
    }
}



