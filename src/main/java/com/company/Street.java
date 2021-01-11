package com.company;

public class Street extends Field{

    int price;
    String subText;
    Player owner;

    public Street(String name, String subText,int price) {
        super(name);
        this.subText = subText;
        this.price = price;
    }

    @Override
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
