package oving7;

import java.util.function.Predicate;

public class CardContainerImpl implements CardContainer {

    @Override
    public int getCardCount() {
       
    }

    @Override
    public Card getCard(int n) {
        
    }

    @Override
    public boolean hasCard(Object object) {
        

    @Override
    public boolean hasCard(Predicate<Card> predicate) {
        return cardDeck.stream().anyMatch(predicate);
    }
    
}
