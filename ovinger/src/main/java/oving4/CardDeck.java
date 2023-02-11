package oving4;

import java.util.ArrayList;
import java.util.List;



public class CardDeck {

    private ArrayList<Card> cardDeck = new ArrayList<Card>();;

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
    public ArrayList<Card> shufflePerfectly() {
        int mid = cardDeck.size() / 2;
        int size = cardDeck.size();

        ArrayList<Card> firstHalf = new ArrayList<>(cardDeck.subList(0, mid));
        ArrayList<Card> secondHalf = new ArrayList<>(cardDeck.subList(mid, size));

        ArrayList<Card> shuffled = new ArrayList<>();
        // should add element from secondhalf and add it to the firsthalf
        // firsthalf has these indexes: 0, 2, 4, 6 etc.
        // secondhalf has 1, 3, 5, 7 etc.
        for (int i = 0; i < size; i++) {

            if (i % 2 == 0) {
                shuffled.add(firstHalf.get(i / 2)); // if i is even then add it
            } else {
                shuffled.add(secondHalf.get(i / 2)); // if i is odd then add alternating cards
            }

        }
        return cardDeck = shuffled;
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

    // move cards from cardDeck object to cardHand class (object)


    public void deal(CardHand hand, int n) {
        // code goes here, should call a remove card method and add it
        // to the cardHand object

        List<Card> temp = new ArrayList<>();
        for (int i =0; i < cardDeck.size(); i++) {
            Card card = cardDeck.remove(cardDeck.size() -1);
            hand.addCard(card);
        }

    }

    @Override
    public String toString() {
        return "CardDeck [cardDeck=" + cardDeck + "]";

    public static void main(String[] args) {
        CardDeck c1 = new CardDeck(3);
        System.out.println(c1);
        CardHand c2 = new CardHand();
        c1.deal(c2, 2);
        System.out.println(c1);
        System.out.println(c2);
        // c2.play(3);
        System.out.println(c2);

    }

}
