package oving5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;






public class CardDeck implements CardContainer, Iterable<Card>, Predicate<Card>{

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


    public int getCardCount() {
        return this.cardDeck.size();
    }

    public Card getCard(int n) {
        if (n < 0 || n > cardDeck.size()) {
            throw new IllegalArgumentException("Illegal value!");
        }
        return cardDeck.get(n);

    }


    public void getCard() {
    
    }

    @Override
    public Iterator<Card> iterator() {
        return new CardContainerIterator(this);
    }


    @Override
    public String toString() {
        return "CardDeck [cardDeck=" + cardDeck + "]";
    }

    public static void main(String[] args) {
        CardDeck c1 = new CardDeck(3);
        System.out.println(c1);
        
       CardContainerIterator iterator = new CardContainerIterator(c1); // creates new iterator for carddeck
       while (iterator.hasNext()) { // while there are cards left
        Card card = iterator.next(); // increment and get card
        System.out.println(card); // print out each card object from cardDeck
       }

       CardContainerIterator iterator2 = new CardContainerIterator();
       while (iterator2.hasNext()) {
        Card card2 = iterator2.next();
        System.out.println(card2);
       }

    }


    @Override
    public boolean hasCard(Predicate<Card> predicate) {
       return cardDeck.stream().anyMatch(predicate); // Check if the card deck contains a card that matches the predicate.
    
    }

    public int getCardCount(Predicate<Card> predicate) {

        return (int) cardDeck.stream().filter(predicate).count(); // returns int of filtered cards, count counts filtered predicate 

    }

    public List<Card> getCards(Predicate<Card> predicate) {
        return cardDeck.stream().filter(predicate).collect(Collectors.toList()); // Filters cardDeck and collects all matches and add to list
    }


    @Override
    public boolean test(Card arg0) {
        return false;
    }


    @Override
    public boolean hasCard(Object object) {
        return false;
    }


   


}
