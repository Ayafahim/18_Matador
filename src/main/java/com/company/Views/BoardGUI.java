package com.company.Views;

import com.company.Models.Fields.*;

import java.awt.*;


public class BoardGUI {
    public static Field[] fields = {
            new Start("START", Color.red, Color.BLACK, 4000, "Modtag kr. 4000"),
            new Street("Rødovrevej", "1.200KR", 1200, Color.blue, Color.BLACK, 50),
            new Chance("Prøv lykken", Color.BLACK, Color.GREEN),
            new Street("Hvidovrevej", "1.200KR", 1200, Color.blue, Color.BLACK, 50),
            new Tax("Skat", Color.cyan, Color.BLACK, 4000, "Betal 4000KR"),
            new Fleet("Scandilines", "Færge", 4000, Color.BLUE, Color.BLACK),
            new Street("Rodskildevej", "2.000KR", 2000, Color.ORANGE, Color.BLACK, 100),
            new Chance("Prøv lykken", Color.BLACK, Color.GREEN),
            new Street("Valby Langgade", "2.000KR", 2000, Color.ORANGE, Color.BLACK, 100),
            new Street("Allégade", "2.400KR", 2400, Color.ORANGE, Color.BLACK, 150),
            new JailVisit("Fængsel", "På besøg", Color.gray, Color.BLACK),
            new Street("Frederiksberg Allé", "2.800KR", 2800, Color.GREEN, Color.BLACK, 200),
            new Brewery("Turborg Squash", "3.000KR", 3000, 100, Color.CYAN, Color.BLACK),
            new Street("Bülowsvej", "2.800KR", 2800, Color.GREEN, Color.BLACK, 200),
            new Street("Gl.Kongevej", "3.200KR", 3200, Color.GREEN, Color.BLACK, 250),
            new Fleet("Mols-Linien", "4.000kr", 4000, Color.RED, Color.BLACK),
            new Street("Bernstorttsvej", "3.600KR", 3600, Color.GRAY, Color.BLACK, 300),
            new Chance("Prøv lykken", Color.BLACK, Color.GREEN),
            new Street("Hellerupvej", "3.600KR", 3600, Color.GRAY, Color.BLACK, 300),
            new Street("Strandvejen", "4000KR", 4000, Color.GRAY, Color.BLACK, 350),
            new Parking("Parking", "Parking", Color.BLUE, Color.BLACK),
            new Street("Trianglen", "4.400KR", 4400, Color.RED, Color.BLACK, 350),
            new Chance("Prøv lykken", Color.BLACK, Color.GREEN),
            new Street("Østerbrogade", "4.400KR", 4400, Color.RED, Color.BLACK, 350),
            new Street("Grønningen", "4.800KR", 4800, Color.RED, Color.BLACK, 400),
            new Fleet("Scandlines", "4.000KR", 4000, Color.BLUE, Color.BLACK),
            new Street("Bredgade", "5.200KR", 5200, Color.WHITE, Color.BLACK, 450),
            new Street("Kgs.Nytorv", "5.200KR", 5200, Color.white, Color.BLACK, 450),
            new Brewery("Coca cola", "3.000KR", 3000, 100, Color.RED, Color.BLACK),
            new Street("Østergade", "5.600KR", 5600, Color.white, Color.BLACK, 500),
            new Jail("Fængsel", Color.gray, Color.black, "De fængsles", 1000),
            new Street("Amagertorv", "6.000KR", 6000, Color.YELLOW, Color.BLACK, 550),
            new Street("Vimmelskattet", "6.000KR", 6000, Color.YELLOW, Color.BLACK, 550),
            new Chance("Prøv lykken", Color.BLACK, Color.GREEN),
            new Street("Nygade", "6.400KR", 6400, Color.YELLOW, Color.BLACK, 600),
            new Fleet("Scandlines", "4.000KR", 4000, Color.BLUE, Color.BLACK),
            new Chance("Prøv lykken", Color.BLACK, Color.GREEN),
            new Street("Fredriksberggade", "7000KR", 7000, Color.MAGENTA, Color.BLACK, 700),
            new Tax("Ekstra ordinær Statskat", Color.CYAN, Color.BLACK, 2000, "Betal 2000KR"),
            new Street("Rådhuspladsen", "8.000KR", 8000, Color.MAGENTA, Color.BLACK, 1000),
    };
}

