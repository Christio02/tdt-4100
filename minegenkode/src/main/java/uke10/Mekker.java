package uke10;

import java.util.ArrayList;
import java.util.Collection;

public class Mekker {
    
    String hairColor;
    Collection<IFollow> listeners = new ArrayList<>();
    int hairLength;

    Follow f;


    public void setHairColor(String newColor) { // neeed to notify follower 
        this.hairColor = newColor;
        this.updateListeners("colour");
    }

     
    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
        this.updateListeners("length");
    }

    private void updateListeners(String what) {
        this.listeners.forEach(l -> l.statusUpdated(this, what)); // updates haircolor for every follower in list
    }

  
    public String getHairColor() {
        return this.hairColor;
    }

    public void addListener(IFollow f) {
        this.listeners.add(f);
    }

    public Follow getF() {
        return f;
    }


    public int getHairLength() {
        return hairLength;
    }

    

    @Override
    public String toString() {
        return "Mekker [hairColor=" + hairColor + ", listeners=" + listeners + ", hairLength=" + hairLength + ", f=" + f
                + "]";
    }


    public static void main(String[] args) {
        Mekker m = new Mekker();
        Follow f = new Follow();
        Follow2 f2 = new Follow2();

        m.addListener(f);
        m.setHairColor("svart");
        m.setHairLength(23);
        System.out.println(m.getHairColor());
        System.out.println(m.getHairLength());
        System.out.println("f: " + f.getHairColor());
        System.out.println("f: " + f.getHairLength());
        

        m.setHairColor("blå");
        System.out.println(m.getHairColor());
        System.out.println("f: " + f.getHairColor());



    }


    

    

}
