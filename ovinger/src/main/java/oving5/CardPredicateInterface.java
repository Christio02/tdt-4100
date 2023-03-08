package oving5;

import java.util.function.Predicate;

public interface CardPredicateInterface extends Predicate<Card> {
    
    public default boolean hasCard(CardContainer container, Card card) {
        return container.hasCard(c -> c.equals(card)); // checks if card is in list
    }




}
