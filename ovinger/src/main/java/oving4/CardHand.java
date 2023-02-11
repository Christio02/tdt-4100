package oving4;

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

    public void addCard(Card type) {
        cardHand.add(type);

    }

    public ArrayList<Card> play(int n) {
        for (int i = cardHand.size() - 1; i >= 0 ; i--) {
            cardHand.remove(n);
        }

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

    public static void main(String[] args) {
        
    }
    
}
