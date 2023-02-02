package oving3;

import java.util.Arrays;
import java.util.List;

public class Card {

    // char color;
    // private int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    // private char[] colors = {'S', 'H', 'D', 'C'}; // char array

    private int value;
    private char color;

    // constructor for card color and value

    public Card(char color, int value) {
        this.value = value;
        this.color = color;

    }

    private boolean validateCard(char color, int value) {
        List<char[]> chars = Arrays.asList(colors);
        if (!chars.contains(color)) {
            return false;
        }

        List<int[]> vals = Arrays.asList(values);
        if (!vals.contains(value)) {
            return false;

        }

        return true;

    }

    public char getSuit() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Card [value=" + value + ", color=" + color + "]";
    }

    public static void main(String[] args) {

        Card c1 = new Card('G', 2);
        System.out.println(c1);
        System.out.println(c1.getSuit());
    }
}
