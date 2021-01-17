package com.company.helper;

import com.company.Controllers.GameController;
import com.company.Models.Fields.Field;
import com.company.Models.Fields.Street;
import com.company.Models.Player;
import com.company.Views.BoardGUI;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

public class PropertyHelper {

    private boolean canBuyWhiteHouse = false;
    private boolean canBuyBlueHouse = false;
    private boolean canBuyRedHouse = false;
    private boolean canBuyGreenHouse = false;
    private boolean canBuyMagentaHouse = false;
    private boolean canBuyYellowHouse = false;
    private boolean canBuyOrangeHouse = false;
    private boolean canBuyGreyHouse = false;



    public boolean isCanBuyWhiteHouse() {
        return canBuyWhiteHouse;
    }

    public void setCanBuyWhiteHouse(boolean canBuyWhiteHouse) {
        this.canBuyWhiteHouse = canBuyWhiteHouse;
    }

    public boolean isCanBuyBlueHouse() {
        return canBuyBlueHouse;
    }

    public void setCanBuyBlueHouse(boolean canBuyBlueHouse) {
        this.canBuyBlueHouse = canBuyBlueHouse;
    }

    public boolean isCanBuyRedHouse() {
        return canBuyRedHouse;
    }

    public void setCanBuyRedHouse(boolean canBuyRedHouse) {
        this.canBuyRedHouse = canBuyRedHouse;
    }

    public boolean isCanBuyGreenHouse() {
        return canBuyGreenHouse;
    }

    public void setCanBuyGreenHouse(boolean canBuyGreenHouse) {
        this.canBuyGreenHouse = canBuyGreenHouse;
    }

    public boolean isCanBuyMagentaHouse() {
        return canBuyMagentaHouse;
    }

    public void setCanBuyMagentaHouse(boolean canBuyMagentaHouse) {
        this.canBuyMagentaHouse = canBuyMagentaHouse;
    }

    public boolean isCanBuyYellowHouse() {
        return canBuyYellowHouse;
    }

    public void setCanBuyYellowHouse(boolean canBuyYellowHouse) {
        this.canBuyYellowHouse = canBuyYellowHouse;
    }

    public boolean isCanBuyOrangeHouse() {
        return canBuyOrangeHouse;
    }

    public void setCanBuyOrangeHouse(boolean canBuyOrangeHouse) {
        this.canBuyOrangeHouse = canBuyOrangeHouse;
    }

    public boolean isCanBuyGreyHouse() {
        return canBuyGreyHouse;
    }

    public void setCanBuyGreyHouse(boolean canBuyGreyHouse) {
        this.canBuyGreyHouse = canBuyGreyHouse;
    }

    public void checkCanBuyHouse2(Player player) {
        switch (player.playerPosition) {
            case 37:
            case 39:
                if (player.getOwnedMagenta() == 2) {
                    setCanBuyMagentaHouse(true);
                }
                break;
            case 1:
            case 2:
                if (player.getOwnedBlue() == 2) {
                    setCanBuyBlueHouse(true);
                }
                break;
            default:
                checkCanBuyHouse3(player);
        }
    }

    public void checkCanBuyHouse3( Player player) {
        switch (player.playerPosition) {
            case 21:
            case 23:
            case 24:
                if (player.getOwnedRed() == 3) {
                    setCanBuyRedHouse(true);
                }
                break;
            case 11:
            case 13:
            case 14:
                if (player.getOwnedGreen() == 3) {
                    setCanBuyGreenHouse(true);
                }
                break;
            case 16:
            case 18:
            case 19:
                if (player.getOwnedGrey() == 3) {
                    setCanBuyGreyHouse(true);
                }
                break;
            case 26:
            case 27:
            case 29:
                if (player.getOwnedWhite() == 3) {
                    setCanBuyWhiteHouse(true);
                }
                break;
            case 6:
            case 8:
            case 9:
                if (player.getOwnedOrange() == 3) {
                    setCanBuyOrangeHouse(true);
                }
                break;
            case 31:
            case 32:
            case 34:
                if (player.getOwnedYellow() == 3) {
                    setCanBuyYellowHouse(true);
                }
                break;
        }
    }
}
