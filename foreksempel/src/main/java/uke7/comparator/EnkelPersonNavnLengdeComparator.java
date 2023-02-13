package uke7.comparator;

import java.util.Comparator;

public class EnkelPersonNavnLengdeComparator implements Comparator<EnkelPerson> {

    @Override
    public int compare(EnkelPerson o1, EnkelPerson o2) {
        
        return o1.getNavn().length() - o2.getNavn().length(); // hvis o1 har et lenger navn enn o2 , vil resultatet være et positivt tall
    }
    
}
