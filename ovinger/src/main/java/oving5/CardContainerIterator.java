package oving5;

import java.util.Iterator;
import java.util.NoSuchElementException;

import oving4.Card;

public class CardContainerIterator implements Iterator<CardContainer> {

    private CardContainer container;
    private int position;

    public CardContainerIterator(CardContainer container) {
        this.container = container;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        
        return position < container.getCardCount();
    }

    @Override
    public CardContainer next() {

        if(!hasNext()) {
            throw new NoSuchElementException("No more cards in container!");
        }
        Card card = container.getCard(position);
        position++;
        return container;
    }
    
}
