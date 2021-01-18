package com.company.Controllers;

import com.company.Models.ChanceCard;
import com.company.Models.Die;
import com.company.Models.Fields.*;
import com.company.Models.Player;
import com.company.Views.BoardGUI;
import gui_fields.GUI_Ownable;
import gui_main.GUI;

import java.awt.*;

public class GameController {

    public Player[] player;
    public GUI gui;
    private int turn = 1;
    Die die1 = new Die(1, 6);
    Die die2 = new Die(1, 6);
    boolean isPlaying = true;
    public Player owner;

    public ChanceCard chanceCard = new ChanceCard();

    public GameController(GUI gui) {
        this.gui = gui;
    }

    private void setUpPlayers() {

        String maxPlayers = gui.getUserSelection("vælg antal spillere", "2", "3", "4", "5", "6");
        player = new Player[Integer.parseInt(maxPlayers)];
        for (int i = 0; i < player.length; i++) {
            String colors = gui.getUserSelection("Vælg en farve.", "Gul", "Rød", "Grøn", "Blå", "Hvid", "Sort");
            Color color;

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

    private void calculatePlayerTurn() {
        if (player.length == 2) {
            while (true) {
                switch (turn) {
                    case 1:
                        movePlayer(player[0]);
                        checkBalance();
                        turn = 2;
                        break;
                    case 2:
                        turn = 1;
                        movePlayer(player[1]);
                        checkBalance();
                        break;

                }
            }
        }
        if (player.length == 3) {
            while (true) {
                switch (turn) {
                    case 1:
                        movePlayer(player[0]);
                        checkBalance();
                        turn = 2;
                        break;
                    case 2:
                        movePlayer(player[1]);
                        checkBalance();
                        turn = 3;
                        break;
                    case 3:
                        movePlayer(player[2]);
                        checkBalance();
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
                        checkBalance();
                        break;
                    case 2:
                        turn = 3;
                        movePlayer(player[1]);
                        checkBalance();
                        break;
                    case 3:
                        turn = 4;
                        movePlayer(player[2]);
                        checkBalance();
                        break;
                    case 4:
                        turn = 1;
                        movePlayer(player[3]);
                        checkBalance();
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
                        checkBalance();
                        break;
                    case 2:
                        turn = 3;
                        movePlayer(player[1]);
                        checkBalance();
                        break;
                    case 3:
                        turn = 4;
                        movePlayer(player[2]);
                        checkBalance();
                        break;
                    case 4:
                        turn = 5;
                        movePlayer(player[3]);
                        checkBalance();
                        break;
                    case 5:
                        turn = 1;
                        movePlayer(player[4]);
                        checkBalance();
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
                        checkBalance();
                        break;
                    case 2:
                        turn = 3;
                        movePlayer(player[1]);
                        checkBalance();
                        break;
                    case 3:
                        turn = 4;
                        movePlayer(player[2]);
                        checkBalance();
                        break;
                    case 4:
                        turn = 5;
                        movePlayer(player[3]);
                        checkBalance();
                        break;
                    case 5:
                        turn = 6;
                        movePlayer(player[4]);
                        checkBalance();
                        break;
                    case 6:
                        turn = 1;
                        movePlayer(player[5]);
                        checkBalance();
                        break;
                }
            }
        }
    }

    private void movePlayer(Player player) {
        gui.showMessage(player.getName() + "'s tur.");
        String playButton = gui.getUserSelection("Tryk på OK for at slå med terningerne", "Slå!");

        if (playButton.equals("Slå!")) {
            int sum = die1.diceTurn(die1) + die2.diceTurn(die2);
            gui.setDice(die1.diceNumber, die1.diceNumber);

            gui.getFields()[player.playerPosition].setCar(player.gui_player, false);
            player.playerPosition += sum;
            if (player.playerPosition >= BoardGUI.fields.length) {
                player.playerPosition -= BoardGUI.fields.length;
                gui.showMessage("Tillykke du modtager 4000Kr for at passere START!!");
                player.gui_player.setBalance(player.gui_player.getBalance() + 4000);
            }
            gui.getFields()[player.playerPosition].setCar(player.gui_player, true);
            landOnField(BoardGUI.fields[player.playerPosition], player);
        }
    }

    private void landOnField(Field field, Player player) {
        if (field instanceof Street) {
            if (!((Street) field).getOwner()) {
                if (gui.getUserLeftButtonPressed("Vil du købe denne grund?", "Ja", "Nej")) {
                    ((Street) field).setHasOwner(true);
                    player.gui_player.setBalance(player.gui_player.getBalance() - ((Street) field).getPrice());
                    owner = player;
                    // Caster til ownable og sætter border til ejers farve
                    GUI_Ownable ownable = (GUI_Ownable) gui.getFields()[owner.playerPosition];
                    ownable.setBorder(owner.gui_player.getPrimaryColor());
                } else {
                    ((Street) field).setHasOwner(false);
                }
            } else {
                if (owner != player) {
                    gui.showMessage("feltet er allerede ejet.");
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
                    owner.setOwnedBreweries();
                    GUI_Ownable ownable = (GUI_Ownable) gui.getFields()[owner.playerPosition];
                    ownable.setBorder(owner.gui_player.getPrimaryColor());
                } else {
                    ((Brewery) field).setHasOwner(false);
                }
            } else {
                if (owner != player) {
                    gui.showMessage("Bryggeriet er allerede ejet.");
                    payRentBrewery(BoardGUI.fields[player.playerPosition], player);
                } else {
                    gui.showMessage("Du ejer allerede feltet.");
                }
            }
        } else if (field instanceof Fleet) {
            if (!((Fleet) field).isHasOwner()) {
                if (gui.getUserLeftButtonPressed("Vil du købe denne færge?", "Ja", "Nej")) {
                    ((Fleet) field).setHasOwner(true);
                    player.gui_player.setBalance(player.gui_player.getBalance() - ((Fleet) field).getPrice());
                    owner = player;
                    owner.setOwnedFleets();
                    GUI_Ownable ownable = (GUI_Ownable) gui.getFields()[owner.playerPosition];
                    ownable.setBorder(owner.gui_player.getPrimaryColor());
                } else {
                    ((Fleet) field).setHasOwner(false);
                }
            } else {
                if (player != owner) {
                    gui.showMessage("Færgen er allerede ejet.");
                    payRentFleet(BoardGUI.fields[player.playerPosition], player);
                } else {
                    gui.showMessage("Du ejer allerede feltet.");
                }
            }
        } else if (field instanceof Tax) {
            gui.showMessage("Du skal betale " + ((Tax) field).getTaxFee() + "Kr i SKAT");
            player.gui_player.setBalance(player.gui_player.getBalance() - ((Tax) field).getTaxFee());
        } else if (field instanceof Jail) {
            gui.showMessage("Du sendes i fængsel og skal betale en bøde på " + ((Jail) field).getJailFee() + "Kr");
            player.gui_player.setBalance(player.gui_player.getBalance() - ((Jail) field).getJailFee());
            gui.getFields()[player.playerPosition].setCar(player.gui_player, false);
            player.playerPosition = 10;
            gui.getFields()[player.playerPosition].setCar(player.gui_player, true);
        } else if (field instanceof JailVisit){
            gui.showMessage("Du er på besøg i fængslet.");
        }
        else if (field instanceof Chance) {
            switch (chanceCard.randomCard()) {
                case 1:
                    payCarInsurance(player);
                    break;
                case 2:
                    lotteryCard(player);
                    break;
                case 3:
                    goToJail(player);
                    break;
                case 4:
                    stockCard(player);
                    break;
                case 5:
                    parkingTicket(player);
                    break;
                case 6:
                    carTires(player);
                    break;
            }
        }
    }

    //Metode som sørger for at spillerne kan betale leje for Street
    private void payRentStreet(Field field, Player player) {
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
    private void payRentFleet(Field field, Player player) {
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

    private void payRentBrewery(Field field, Player player) {
        if (field instanceof Brewery) {
            if (player.gui_player.getBalance() >= 100) {
                gui.showMessage("Du skal betale " + 100 + "KR, til " + owner.gui_player.getName());
                player.gui_player.setBalance(player.gui_player.getBalance() - 100);
                owner.gui_player.setBalance(owner.gui_player.getBalance() + 100);
            } else {
                gui.showMessage("Du har ikke nok penge til at betale ejeren.");
            }
        }
    }

    //Chancekort
    private void goToJail(Player player) {
        gui.displayChanceCard("CHANCEKORT: Du er blevet taget for at køre for hurtigt. Du fængsles, og mister 1000KR. Du modtager ikke 4000KR for at passere START.");
        gui.getFields()[player.playerPosition].setCar(player.gui_player, false);
        player.playerPosition = 10;
        gui.getFields()[player.playerPosition].setCar(player.gui_player, true);
        player.gui_player.setBalance((player.gui_player.getBalance() - 1000));
        gui.displayChanceCard();
    }

    private void payCarInsurance(Player player) {
        gui.displayChanceCard("CHANCEKORT: Betal din bilforsikring på " + 1000 + "KR");
        player.gui_player.setBalance(player.gui_player.getBalance() - 1000);
        gui.displayChanceCard();
    }

    private void lotteryCard(Player player) {
        gui.displayChanceCard("CHANCEKORT: Du har vundet klasselotteriet, du modtager derfor " + 500 + "KR");
        player.gui_player.setBalance(player.gui_player.getBalance() + 500);
        gui.displayChanceCard();
    }

    private void stockCard(Player player) {
        gui.displayChanceCard("CHANCEKORT: Du har modtaget aktieudbytte, du modtager derfor " + 1000 + "KR");
        player.gui_player.setBalance(player.gui_player.getBalance() + 1000);
        gui.displayChanceCard();
    }

    private void parkingTicket(Player player) {
        gui.displayChanceCard("CHANCEKORT: Du har fået en parkeringsbøde, betal " + 200 + "KR");
        player.gui_player.setBalance(player.gui_player.getBalance() - 200);
        gui.displayChanceCard();
    }

    private void carTires(Player player) {
        gui.displayChanceCard("CHANCEKORT: Du har købt fire nye dæk til din bil, betal " + 1000 + "KR");
        player.gui_player.setBalance(player.gui_player.getBalance() - 1000);
        gui.displayChanceCard();
    }


    private void checkBalance() {
        for (int i = 0; i < player.length; i++) {
            if (player[i].gui_player.getBalance() <= 0) {
                gui.showMessage(player[i].gui_player.getName() + " har tabt...");

                findWinner();

                this.isPlaying = false;
                gui.close();
            }
        }
    }

    private void findWinner() {
        int i;
        int max = player[0].gui_player.getBalance();
        String name = player[0].gui_player.getName();

        for (i = 1; i < player.length; i++) {
            if (player[i].gui_player.getBalance() > max) {
                max = player[i].gui_player.getBalance();
                name = player[i].gui_player.getName();
            }
        }
        gui.showMessage(name + " har vundet!!!");
    }

    public void game() {
        setUpPlayers();
        while (isPlaying) {
            this.calculatePlayerTurn();
        }
    }

}










