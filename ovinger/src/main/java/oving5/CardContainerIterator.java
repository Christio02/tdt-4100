package oving5;

import java.util.Iterator;


public class CardContainerIterator implements Iterator<Card> {

    private CardContainer container;
    private int currentIndex; // Initialize the iterator with the container and the current index.


    public CardContainerIterator(CardContainer container) {
        this.container = container;
        this.currentIndex = 0; // currentindex set to 0

    }
    @Override
    public boolean hasNext() {
        return currentIndex < container.getCardCount(); // checks if currentIndex is less than container.getCardCount()
        
    }

    @Override
    public Card next() {
        return container.getCard(currentIndex++); // Returns the next card in the container and increments currentIndex

    }
    
}
