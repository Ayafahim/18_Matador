package com.company.Models;

import com.company.Views.BoardGUI;
import gui_fields.GUI_Player;

public class Player {

    private String name;
    private int playerPosition = 0;
    private int ownedBrewerys;
    private int ownedHouses;
    private int ownedHotels;
    private int ownedFleets;
    private int ownedStreets;
    private boolean jailed;
    private int account;

    private GUI_Player gui_player;

    public static BoardGUI boardGUI = new BoardGUI();

    private Player[] players = new Player[boardGUI.getPlayerAmount()];


    public Player(String name, int account){
        this.name = name;
        this.account = account;
        this.ownedBrewerys = 0;
        this.ownedFleets = 0;
        this.ownedStreets = 0;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setOwnedBrewerys(int ownedBrewerys) {
        this.ownedBrewerys += 1;
    }

    public int getOwnedBrewerys() {
        return ownedBrewerys;
    }

    public int getOwnedFleets() {
        return ownedFleets;
    }

    public void setOwnedFleets(int ownedFleets) {
        this.ownedFleets += 1;
    }


    public int getOwnedHotels() {
        return ownedHotels;
    }

    public void setOwnedHotels(int ownedHotels) {
        this.ownedHotels = ownedHotels;
    }

    public int getOwnedStreets() {
        return ownedStreets;
    }

    public void setOwnedStreets(int ownedStreets) {
        this.ownedStreets = ownedStreets;
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

    public void setOwnedHouses(int ownedHouses) {
        this.ownedHouses = ownedHouses;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void payRent(int rent, Player owner){
        if (account > rent){
            owner.setAccount(account+rent);
            setAccount(account-rent);
        }
        else{
            boardGUI.getGui().showMessage("Du har ikke nok penge");
        }
    }

    // Tilføjer spilleren til brættet
    public void createPlayer() {
        gui_player = new GUI_Player(name, 0);
        boardGUI.getGui().addPlayer(gui_player);
    }



}



