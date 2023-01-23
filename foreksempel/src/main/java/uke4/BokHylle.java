package uke4;

import java.util.ArrayList;
import java.util.List;

public class BokHylle {
    
    private List<Bok> hylle = new ArrayList<>();


    private void addBook(Bok bok) {
        this.hylle.add(bok);
    }

    

    public List<Bok> getHylle() {
        return hylle;
    }

    @Override
    public String toString() {
        return  hylle.toString();
    }

    private Bok getBook(int i) {
        return hylle.get(i);
    }

    public static void main(String[] args) {
        BokHylle b = new BokHylle();
        b.addBook(new Bok("Game of Thrones", 750));
        b.addBook(new Bok("Harry Potter", 450));
        System.out.println(b);
        Bok bok = b.getBook(0);
        System.out.println(bok);

        List<Bok> hylle2 = b.getHylle();
        hylle2.add(new Bok("Peter Pan", 128));
        System.out.println(b);
            
    }





}



    






