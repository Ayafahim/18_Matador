package com.company.Models;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;
import java.util.ArrayList;

public class Player {

    private String name;
    public int playerPosition = 0;
    private int ownedBreweries;
    private int ownedHouses;
    private int ownedHotels;
    private int ownedFleets;
    private int ownedStreets;
    private int ownedRed;

    private boolean jailed = false;
    private int account;
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

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setOwnedBrewerys() {
        this.ownedBreweries += 1;
    }

    public int getOwnedBreweries() {
        return ownedBreweries;
    }

    public int getOwnedFleets() {
        return ownedFleets;
    }

    public void setOwnedFleets() {
        this.ownedFleets += 1;
    }


    public int getOwnedHotels() {
        return ownedHotels;
    }

    public void setOwnedHotels() {
        this.ownedHotels += 1;
    }

    public int getOwnedStreets() {
        return ownedStreets;
    }

    public void setOwnedStreets() {
        this.ownedStreets += 1;
    }

    public int getOwnedRed() {
        return ownedRed;
    }

    //todo lav alle for alle farver og lav regelsæt som retunere boolean hvor mange man skal have
    public void setOwnedRed() {
        this.ownedRed += 1;
    }

    public boolean isJailed() {
        return jailed;
    }

    public void setJailed(boolean jailed) {
        this.jailed = jailed;
    }

    public int getOwnedHouses() {
        return ownedHouses;
    }

    public void setOwnedHouses() {
        this.ownedHouses = ownedHouses;
    }

    public GUI_Player getGui_player() {
        return gui_player;
    }

}



