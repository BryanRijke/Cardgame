package com.BryanRijke;

public class Card {

    private String suit;
    private String name;
    private int value;

    // Dit is de constructor om Card op te roepen.
    public Card(String suit, String name, int value) {
        this.suit = suit;
        this.name = name;
        this.value = value;
    }

    // Getter voor name.
    public String getName() {
        return name;
    }

    // Getter voor value.
    public int getValue() {
        return value;
    }
}