package com.company.Models;

import java.util.Random;

public class ChanceCard {

    private final int[] chanceCard = new int[]{1, 2, 3};
    Random random = new Random();


    public int randomCard() {
        return this.random.nextInt(this.chanceCard.length - 1) + 1;
    }

}
