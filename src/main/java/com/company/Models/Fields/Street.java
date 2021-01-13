package com.company.Models.Fields;

//import com.company.Models.Player;

import java.awt.*;

public class Street extends Field {

    int price;
    String subText;

    public Street(String name, String subText, int price,Color bgColor, Color fgColor) {
        super(name, bgColor, fgColor);
        this.subText = subText;
        this.price = price;
    }

    //Player owner;



    @Override
    public void setName(String name) {

        super.setName(name);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getSubText() {
        return subText;
    }


    /* @Override
    public void landOnField(Player player) {
        super.landOnField(player);
        if (player ==  owner){
            System.out.println(player + " ejer allerede grunden.");
        }
        else if (owner == null){
            System.out.println("Du ejer nu grunden");
        }
        else if (player != owner){
            System.out.println("Grunden er allerede ejet");
        }
        else{
            System.out.println("Du har ikke nok penge");

        }
    }
}
*/
}
