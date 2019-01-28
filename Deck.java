package com.BryanRijke;

import java.util.ArrayList;

public class Deck {

    // Dit is de ArrayList van kaarten.
    ArrayList<Card> cards = new ArrayList<>();

    public Deck() {

        // De suits worden gemaakt.
        for (int s = 0; s < 4; s++) {
            String suit = "";

            switch (s) {
                case 0:
                    suit = "harten";
                    break;
                case 1:
                    suit = "klaver";
                    break;
                case 2:
                    suit = "ruiten";
                    break;
                case 3:
                    suit = "schoppen";
                    break;
            }

            // De names worden gemaakt + de overige nummers.
            for (int v = 2; v < 15; v++) {
                String name = "";

                switch (v) {
                    case 11:
                        name = "boer " + suit;
                        break;
                    case 12:
                        name = "vrouw " + suit;
                        break;
                    case 13:
                        name = "koning " + suit;
                        break;
                    case 14:
                        name = "aas " + suit;
                        break;
                    default:
                        name = v + "  " + suit;
                }

                // Hier komt de kaart in de ArrayList.
                Card c = new Card(suit, name, v);
                cards.add(c);
            }
        }
    }
}