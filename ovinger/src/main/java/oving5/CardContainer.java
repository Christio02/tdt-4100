package oving5;

import java.util.function.Predicate;

public interface CardContainer {

    public int getCardCount();
    public Card getCard(int n);
    public boolean hasCard(Object object);
    boolean hasCard(Predicate<Card> predicate);


}   

