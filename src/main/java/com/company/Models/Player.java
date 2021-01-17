package com.company.Models;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class Player {

    private String name;
    public int playerPosition = 0;
    private int ownedBreweries;
    private int ownedHouses;
    private int ownedHotels;
    private int ownedFleets;
    private int ownedStreets;
    private int ownedRed;
    private int ownedOrange;
    private int ownedMagenta;
    private int ownedYellow;
    private int ownedWhite;
    private int ownedGrey;
    private int OwnedGreen;
    private int OwnedBlue;
    private Color ownedStreetColor;
    public GUI_Player gui_player;


    public Player(GUI gui, Color color) {

        this.name = gui.getUserString("Skriv navn");
        GUI_Car car = new GUI_Car();
        car.setPrimaryColor(color);

        gui_player = new GUI_Player(name, 30000, car);
        gui.addPlayer(gui_player);
    }


    public int getOwnedBlue() { return OwnedBlue; }

    public void setOwnedBlue() {
        OwnedBlue += 1;
    }

    public String getName() {
        return name;
    }

    public void setOwnedBreweries() {
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

    public int getOwnedRed() { return ownedRed; }

    public void setOwnedRed() { this.ownedRed += 1; }

    public int getOwnedOrange() { return ownedOrange; }

    public void setOwnedOrange() { this.ownedOrange += 1; }

    public int getOwnedMagenta() { return ownedMagenta; }

    public void setOwnedMagenta() { this.ownedMagenta += 1; }

    public int getOwnedYellow() { return ownedYellow; }

    public void setOwnedYellow() { this.ownedYellow += 1; }

    public int getOwnedWhite() { return ownedWhite; }

    public void setOwnedWhite() { this.ownedWhite += 1; }

    public int getOwnedGrey() { return ownedGrey; }

    public void setOwnedGrey() { this.ownedGrey += 1; }

    public int getOwnedGreen() { return OwnedGreen; }

    public void setOwnedGreen() { OwnedGreen += 1; }

    public int getOwnedHouses() { return ownedHouses; }

    public void setOwnedHouses() { this.ownedHouses = ownedHouses; }

    public GUI_Player getGui_player() { return gui_player; }

    public void setOwnedStreetColor(Color ownedStreetColor) {
        if (ownedStreetColor == Color.red) {
            setOwnedRed();
        } else if (ownedStreetColor == Color.ORANGE) {
            setOwnedOrange();
        } else if (ownedStreetColor == Color.gray) {
            setOwnedGrey();
        } else if (ownedStreetColor == Color.white) {
            setOwnedWhite();
        } else if (ownedStreetColor == Color.yellow) {
            setOwnedYellow();
        } else if (ownedStreetColor == Color.green) {
            setOwnedGreen();
        } else if (ownedStreetColor == Color.BLUE) {
            setOwnedBlue();
        } else if (ownedStreetColor == Color.MAGENTA) {
            setOwnedMagenta();
        }

    }

    public Color getOwnedStreetColor() {
        return ownedStreetColor;
    }
}



