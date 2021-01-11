package com.company;

abstract class Field {

    String name;

    public Field(String name){
        this.name = name;
    }

    public void landOnField(Player player){
        System.out.println(player +" er landet");
    }




}
