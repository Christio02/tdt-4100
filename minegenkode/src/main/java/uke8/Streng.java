package uke8;

import java.util.Iterator;

public class Streng implements Iterable<Character> {
    String streng;


    public String getStreng() {
        return streng;
    }

    public Streng(String streng) {
        this.streng = streng;
    }

    public static void main(String[] args) {
        Streng s = new Streng("Hoppeslott");
        
        for (Character c : s) { // itererer gjennom
            System.out.println("Tegn: " + c);
            
        }




    }

    @Override
    public Iterator<Character> iterator() {
        return new StrengIterator(this.streng);
    }

}
