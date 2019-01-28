package com.BryanRijke;

import java.util.*;

public class Main {

    static String input;
    static int totaleScore = 0;

    public static void main(String[] args) {
        intro();
        vragen();
    }

    // Dit is de intro en uitleg van het spel. Dit wordt altijd laten zien bij het opstarten.
    public static void intro() {
        System.out.println("Welkom bij de Card Game!");
        System.out.println("");
        System.out.println("In dit spel krijg je een kaart te zien.");
        System.out.println("Je moet steeds gokken of de volgende kaart hoger of lager is.");
        System.out.println("Je score wordt bijgehouden. Als je fout gokt is het spel voorbij.");
        System.out.println("Succes!");
        System.out.println("");
    }

    // Dit krijg je te zien als je een vraag goed beantwoord.
    public static void goedAntwoord() {
        System.out.println("");
        System.out.println("Goed gegokt!");
        totaleScore = totaleScore + 1;
        System.out.println("De totale score is " + totaleScore);
        System.out.println("");
        vragen();
    }

    // Dit krijg je te zien als je een vraag fout beantwoord.
    public static void foutAntwoord() {
        System.out.println("");
        System.out.println("Helaas! fout gegokt.");
        System.out.println("De totale score is " + totaleScore);
        System.out.println("Het spel is voorbij");
    }

    public static void vragen() {
        Scanner sc = new Scanner(System.in);

        // De Deck class wordt opgeroepen.
        Deck d = new Deck();

        // Dit trekt een random kaart.
        Random r = new Random();
        int kaart1 = r.nextInt(d.cards.size());
        int kaart2 = r.nextInt(d.cards.size());
        Card huidigeKaart = d.cards.get(kaart1);
        Card volgendeKaart = d.cards.get(kaart2);
        System.out.println("Deze kaart is getrokken: " + d.cards.get(kaart1).getName());
        System.out.println("Is de volgende kaart hoger of lager?");
        input = sc.nextLine();
        switch (input.toLowerCase()) {
            case "hoger":
                if (huidigeKaart.getValue() < volgendeKaart.getValue()) {
                    goedAntwoord();
                    break;
                } else {
                    foutAntwoord();
                    break;
                }

            case "lager":
                if (huidigeKaart.getValue() > volgendeKaart.getValue()) {
                    goedAntwoord();
                    break;
                } else {
                    foutAntwoord();
                    break;
                }

            // Dit krijg je te zien als de speler iets fouts heeft ingetypt.
            default:
                System.out.println("Er is iets fout gegaan. Voer 'hoger' of 'lager' in.");
                input = sc.nextLine();
        }
    }
}