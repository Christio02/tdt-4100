package oving3;

import java.util.Arrays;
import java.util.List;

public class Card {

    private int value;
    private char color;

    // constructor for card color and value

    public Card(char color, int value) {

        if (validateCard(color, value)) {
            throw new IllegalArgumentException("Illegal value or color!");
        }
        this.value = value;
        this.color = color;

    }

    private boolean validateCard(char color, int value) {

        if (value < 1 || value > 13) {
            return false;
        }

        if (color != 'S' || color != 'H' || color != 'D' || color != 'C') {
            return false;
        }

        return true;
    }

    public char getSuit() {
        return this.color;
    }

    public int getFace() {
        return this.value;
    }

    @Override
    public String toString() {
        return color + "" + value;
    }

    public static void main(String[] args) {

        Card c1 = new Card('S', 2);
        System.out.println(c1);
    }
}
