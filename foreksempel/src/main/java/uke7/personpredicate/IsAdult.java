package uke7.personpredicate;

import java.util.function.Predicate;

public class IsAdult implements Predicate<Person>  {

    @Override
    public boolean test(Person t) {
        
        return t.getAge() > 17; // is this person older than 17     
    
    }
    
}
