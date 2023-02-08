package oving4.objecstructures;

import java.util.ArrayList;

public class CardHand {

    private ArrayList<Card> cardHand = new ArrayList<Card>();


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

    public Card addCard(Card type) {

    

    }



    public static void main(String[] args) {
        
    }
    
}
