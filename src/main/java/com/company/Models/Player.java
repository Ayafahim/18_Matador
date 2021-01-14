package com.company.Models;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

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
    public GUI_Player gui_player;
    private int PlayerId;


    public Player(GUI gui, Color color){

       name = gui.getUserString("Skriv navn");
       GUI_Car car = new GUI_Car();
       car.setPrimaryColor(color);

       gui_player = new GUI_Player(name,30000,car);
       gui.addPlayer(gui_player);
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

    public void payRent(int rent, Player owner){
        if (account > rent){
            owner.setAccount(account+rent);
            setAccount(account-rent);
        }
        else{
            System.out.println("hhdhd");
        }

    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getPlayerId() {
        return PlayerId;
    }

    public void setPlayerId(int playerId) {
        PlayerId = playerId;
    }





    public GUI_Player getGui_player() {
        return gui_player;
    }





}



