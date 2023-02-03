package oving3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CardDeck {

    private ArrayList<Card> cardDeck = new ArrayList<Card>();

    // constructor
    // if n = 2, then add 8 cards, index: 0-8 (Spare) (1, 2, 3, 4, 5, 6, 7, 8)
    public CardDeck(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot initizalize deck with 0 cards!");
        }

        // for loop for spare
        for (int i = 1; i <= n; i++) {
            cardDeck.add(new Card('S', i));
        }

        // for loop for heart
        for (int i = 1; i <= n; i++) {
            cardDeck.add(new Card('H', i));

        }

        for (int i = 1; i <= n; i++) {
            cardDeck.add(new Card('D', i));

        }

        for (int i = 1; i <= n; i++) {
            cardDeck.add(new Card('C', i));
        }

    }

    // method that shuffles card
    public int shufflePerfectly() {
        int mid = cardDeck.size() / 2;
        int size = cardDeck.size();

        ArrayList<Card> firstHalf = new ArrayList<>(cardDeck.subList(0, mid));
        ArrayList<Card> secondHalf = new ArrayList<>(cardDeck.subList(mid, size));
        
        ArrayList<Card> shuffled = new ArrayList<>();
        // should add element from secondhalf and add it to the firsthalf
        // firsthalf has these indexes: 0, 2, 4, 6 etc.
        // secondhalf  has 1, 3, 5, 7 etc.
        for (int i = 0; i < secondHalf.size(); i++ ) {
            if (i % 2 == 0) {
                firstHalf.set(i, (secondHalf.get(i)));
                

            } 

 
}

    // return total card objects in deck

    public int getCardCount() {
        return this.cardDeck.size();
    }

    public Card getCard(int n) {
        if (n < 0 || n > cardDeck.size()) {
            throw new IllegalArgumentException("Illegal value!");
        }
        return cardDeck.get(n);

    }

    @Override
    public String toString() {
        return "CardDeck [cardDeck=" + cardDeck + "]";
    }

    public static void main(String[] args) {
        CardDeck deck1 = new CardDeck(3);
        System.out.println(deck1.getCardCount());
        System.out.println(deck1);
        System.out.println(deck1.shufflePerfectly());

    }

}
