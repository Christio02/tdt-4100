package oving5;

import java.util.ArrayList;
import java.util.Iterator;


public class CardHand implements CardContainer, Iterable<Card>{

    private ArrayList<Card> cardHand = new ArrayList<Card>();


    public CardHand() {
    
    }


    // get how many cards in hand
    public int getCardCount() {
        return this.cardHand.size();
    }

    // gets i card in hand
    public Card getCard(int i) {
        if (i < 0 || i > cardHand.size()) {
            throw new IllegalArgumentException("Kan ikke få kort utenfor håndstørrelsen!");
        }
        return cardHand.get(i);
    }

    public void addCard(Card type) {
        cardHand.add(type);

    }

    public ArrayList<Card> play(int n) {
        cardHand.remove(cardHand.get(n));
        return cardHand;
    }
    



    @Override
    public String toString() {
        return "{" +
            " cardHand='" + getCardHand() + "'" +
            "}";
    }
    



    public ArrayList<Card> getCardHand() {
        return this.cardHand;
    }
    @Override
    public Iterator<Card> iterator() {
        return new CardContainerIterator(this); // Iterator for the CardHand class
    }

    public static void main(String[] args) {
        
    }


   
    
}
