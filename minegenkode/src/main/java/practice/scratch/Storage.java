package practice.scratch;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Year> liste = new ArrayList<>(); // creates a new list object
    

    public void addYear(Year year) {
        liste.add(year);
    }

    public Year getPlace(int i) {
        if (i < liste.size()) {
            return liste.get(i);
        }
    }


    public static void main(String[] args) {
        Storage s = new Storage();
        s.addYear(new Year(1974, 30));
        s.addYear(new Year(1975, 25));
        s.addYear(new Year(1976, 22));
        s.addYear(new Year(1977, 31));
        System.out.println(s.getPlace(2));
    }


}
