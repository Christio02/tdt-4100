package uke6.kode;

import java.util.ArrayList;
import java.util.Collection;

import javafx.beans.binding.BooleanExpression;
import uke6.fasit.File;

public class Folder {
    String name;
    Folder parent;
    Collection<Folder> folders = new ArrayList<>(); // collection av type folder, vil lage den på forskjellige måter i ulike konstruktører
    Collection<File> files = new ArrayList<>();//

    public Folder(String name, Folder parent) {
        this.name = name;
        this.parent = parent;
        if (parent != null) {
            parent.addFolder(this);
        }
        
    }

    public void addFolder(Folder folder) {
        this.folders.add(folder);
    }
    
    public void removeFolder(Folder folder) {
        this.folders.remove(folder);
    }

    public Folder getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() { // ønsker å skrive ut hele pathen til en folder/fil
        String tmp = "/" + getName();
        if (this.parent != null) // vil få nullpointexception ellers
            tmp = parent.toString() + tmp; // setter sammen parent med current folder
        return tmp;
    }


    public void printTree() {
        System.out.println(this);
        for (Folder folder : folders) { // for each loop that uses recursion to travel the tree
            folder.printTree();
        }
    }

    private boolean contains(Folder destination) { // går gjennom hver av undermappene og sjekker om folderen befinner seg i den
        if (this.equals(destination)) {
            return true;
        }
        for (Folder folder : folders) {
            if (folder.contains(destination)) {
                return true;
            }
        }

        return false;
    }




    public void move(Folder destination) { // flytter folder til en ny parent folder
        if (this.contains(destination)) {
            throw new IllegalStateException("Du prøver å flytte en mappe inni seg selv");
        }
        parent.removeFolder(this); // objektet er i en viss tilstand, må endre tilstanden til den originale parent folder og den nye
        this.parent = destination;
        parent.addFolder(this); // gir beskjed til den nye parent folderen
    }

    private Collection<Folder> getFolders() {
        return this.folders;
    }

    public static void main(String[] args) {
        Folder home = new Folder("home",null); // home folder, satt til null (siden den ikke befinner seg i en folder) // root folder
        Folder andreas = new Folder("andreas",home); // legger til en folder i root folderen
        Folder borgeh = new Folder("borgeh",home);
        Folder carsten = new Folder("carsten",home);
        Folder adiv = new Folder("adiv",andreas);
        Folder bdiv = new Folder("bdiv",borgeh);
        Folder btmp = new Folder("btmp",borgeh);
        Folder cdiv = new Folder("cdiv",carsten);
        // System.out.println(home);
        // System.out.println(btmp.getParent()); 

        // home.printTree(); 
        // andreas.printTree();

        cdiv.move(bdiv);
        // System.out.println(cdiv);
        System.out.println("Før flytting av borgeh");
        // home.printTree();

        borgeh.move(cdiv);
        System.out.println("Etter flytting av borgeh");
        // home.printTree();

        borgeh.printTree();
        
    }



}
