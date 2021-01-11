package com.company.Views;

import gui_main.GUI;

import static java.lang.Integer.parseInt;

public class BoardGUI {
    private final GUI gui = new GUI();
    private int playerAmount;

    public BoardGUI() {
        this.playerAmount = parseInt(gui.getUserSelection("Hvor mange spillere er i?", "2", "3", "4", "5", "6"));
    }

    public int getPlayerAmount() {
        return playerAmount;
    }

    public void setPlayerAmount(int playerAmount) {
        this.playerAmount = playerAmount;
    }

    public GUI getGui() {
        return gui;
    }
}
