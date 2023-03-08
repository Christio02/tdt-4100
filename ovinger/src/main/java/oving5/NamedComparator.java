package oving5;

import java.util.Comparator;

public class NamedComparator implements Comparator<Named> {

    @Override
    public int compare(Named named1, Named named2) {
        // saves the value returned from compareTo, when comparing familyname
        int compareFamilyName = named1.getFamilyName().compareTo(named2.getFamilyName());
        
        if (compareFamilyName < 0) { // if less than 0 (meaning named1 is comes first in alphabet)
            return -1;
        }
        else if (compareFamilyName > 0) {
            return 1;
        }

        if (compareFamilyName == 0) { // if familiy name returned is 0
            
            int compareGivenName = named1.getGivenName().compareTo(named2.getGivenName()); // then compare givenname
            
            if  (compareGivenName > 0) { // do the same thing
                return 1;
            }
            else if (compareGivenName < 0) {
                return -1;
            }


        }
        return 0; // if also givenName is equal, return 0
    }
    
}
