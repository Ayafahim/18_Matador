package com.company.Models;

import java.util.Random;

public class ChanceCard {// har fået array af int og fået en metode der hedder random cards

    private final int[] chanceCard = new int[]{1, 2, 3, 4, 5, 6};
    Random random = new Random();


    public int randomCard() {
        return this.random.nextInt(this.chanceCard.length - 1) + 1;
    }

}
