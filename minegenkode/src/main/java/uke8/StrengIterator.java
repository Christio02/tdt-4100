package uke8;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StrengIterator implements Iterator<Character> {

    int pos;
    String s;

    public StrengIterator(String s) {
        this.s = s;
        pos = 0;
    }
    @Override
    public boolean hasNext() {
        return pos < s.length(); // kan ikke gå lenger enn lengden til strengen
    }

    @Override
    public Character next() {
        if (!hasNext()) throw new NoSuchElementException("Ingen flere chars igjen!");
        Character tmpChar = s.charAt(pos); // l
        pos++; // må inkrementere
        return tmpChar;
        
    }

}
