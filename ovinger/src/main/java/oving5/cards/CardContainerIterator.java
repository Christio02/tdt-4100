package oving5.cards;

import java.util.Iterator;
import java.util.NoSuchElementException;

import oving4.Card;

public class CardContainerIterator implements Iterator<CardContainer> {

    private CardContainer container;
    private int position; // position that keeps track of a card object postion in a container


    public CardContainerIterator(CardContainer container) {
        this.container = container;
        this.position = 0; // sets position to 0 when constructor is called

    }
    @Override
    public boolean hasNext() {
        
        return position < container.getCardCount(); // returns true if the position is less than cardCount, or it will return false
        
    }

    @Override
    public CardContainer next() {

        if(!hasNext()) { // throw exception if hasNext returns false
            throw new NoSuchElementException("No more cards in container!");
        }
        
        position++;
        return (CardContainer) container.getCard(position + 1);
    }
    
}
