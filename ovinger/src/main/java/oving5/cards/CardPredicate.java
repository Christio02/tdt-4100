package oving5.cards;

import java.util.function.Predicate;

import oving4.Card;

public interface CardPredicate implements Predicate<Card>{

    @Override
    public boolean test(Card t) {

        if (t.equals())
        return false;
    }
    
}
