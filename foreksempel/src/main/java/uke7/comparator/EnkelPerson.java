package uke7.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnkelPerson implements Comparable<EnkelPerson> {
    String navn;

    public String getNavn() {
        return navn;
    }

    public EnkelPerson(String navn) {
        this.navn = navn;
    }


    

    @Override
    public String toString() {
        return "EnkelPerson [navn=" + navn + "]";
    }

    public static void main(String[] args) {
        List<EnkelPerson> simpletons = new ArrayList<>();
        simpletons.add(new EnkelPerson("Per"));
        simpletons.add(new EnkelPerson("Pål-Vidar"));
        simpletons.add(new EnkelPerson("Espen"));

        Collections.sort(simpletons);
//        simpletons.sort(new EnkelPersonSortering());

        simpletons.sort(new EnkelPersonNavnLengdeComparator());

        for (EnkelPerson enkelPerson : simpletons) {
            System.out.println(enkelPerson);
        }
    }

    @Override
    public int compareTo(Object o) {
        EnkelPerson tmpEnkel = (EnkelPerson) o; // må caste denne 
        return this.getNavn().compareTo(tmpEnkel.getNavn());
    }

   
}
