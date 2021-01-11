package com.company;

import gui_main.GUI;

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


    Player(String name,int account){
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

    public void payRent(int rent, Player owner){
        if (account > rent){
            owner.setAccount(account+rent);
            setAccount(account-rent);
        }
        else{
            System.out.println("hhdhd");
        }

    }



}



