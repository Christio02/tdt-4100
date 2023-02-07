package uke6.kode;

import java.util.ArrayList;
import java.util.Collection;

public class Folder {
    String name;
    Folder parent;
    Collection<Folder> folders = new ArrayList<>();
    Collection<File> files = new ArrayList<>();

    public Folder(String name, Folder parent) {
        this.name = name;
        this.parent = parent;
        if (parent != null)
            parent.addFolder(this);
    }

    public void addFolder(Folder folder) {
        this.folders.add(folder);
    }
    
    public void removeFolder(Folder folder) {
        this.folders.remove(folder);
    }

    public void addFile(File file) {
        this.files.add(file);
    }
    
    public void removeFile(File file) {
        this.files.remove(file);
    }

    public Folder getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String tmp = "/"+getName();
        if (this.parent != null)
            tmp = parent.toString() + tmp;
        return tmp;
    }

    public void printTree() {
        System.out.println(this);
        for (File file : files) {
            System.out.println(file);
        }
        for (Folder folder : folders) {
            folder.printTree();
        }
    }

    private boolean contains(Folder destination) {
        System.out.println("Inni contains for "+this+" mot "+destination);
        if (this.equals(destination)) return true;
        for (Folder tmpfolder : folders) { // går gjennom alle subfolderne til folderne, og sjekker om den er lik destination
            // gitt alle undertypene av objektet Folder, kaller de for tmpfolder
            if (tmpfolder.contains(destination)) return true; // objektene som er this, endrer seg hele tiden gjennom det rekursive kallet
        }
        return false;
    }


    private boolean contains2(Folder destination) {
        System.out.println("Inni contains2 for "+this+" mot "+destination);
        if (destination == null) return false; // her så lar vi this være home, men endrer destination istedet underveis (men destination endrer seg egentlig ikke)
        if (this == destination) return true; 
        return this.contains2(destination.getParent()); // går til destination sin parent
    }

    public void move(Folder destination) {
        if (this.contains2(destination)) // this er f.eks. cdiv, destination er den nye. Sjekker om den nye er lik den du prøver å flytte
            throw new IllegalStateException("Du prøver å flytte en mappe inni seg selv.");
        parent.removeFolder(this); // akkurat denne parenten, fjerner denne (this) subfolderen/filen
        this.parent = destination; // endres parent til destination
        parent.addFolder(this); // den nye parenten får inn this (som er subfolderen som ble fjernet tidligere)
    }

    private Collection<Folder> getFolders() {
        return this.folders;
    }

    public Object findFirst(String pattern) {
        for (File file : files) {
            if (file.getName().equals(pattern))
                return file;
        }

        for (Folder folder : folders) {
            if (folder.getName().equals(pattern))
                return folder;
        }

        for (Folder folder : folders) {
            Object found = folder.findFirst(pattern); // vet ikke hva som returneres, men kan være enten file (object) eller folder (object)
            if (found != null)
                return found;
        }

        return null;

    }


    private void findAll(String pattern, Collection<Object> hits ) {
        // går gjennom filene
        for (File file : files) {
            if (file.getName().contains(pattern)) {
                hits.add(file);
            }
        }
        // går gjennomm navnene til underfolderne
        for (Folder folder : folders) {
            if (folder.toString().contains(pattern)) {
                hits.add(folder);
            }
        }

        for (Folder folder : folders) {
            folder.findAll(pattern, hits);
        }


    }


    public Collection<Object> findAll(String pattern) {

        Collection<Object> tmp = new ArrayList<>(); // bør være rekursjon for å lete gjennom helle hierarkiet


        findAll(pattern, tmp);

        return tmp;


    }

    public static void main(String[] args) {
        Folder home = new Folder("home",null);
        Folder andreas = new Folder("andreas",home);
        Folder borgeh = new Folder("borgeh",home);
        Folder carsten = new Folder("carsten",home);
        Folder adiv = new Folder("adiv",andreas);
        Folder bdiv = new Folder("bdiv",borgeh);
        Folder btmp = new Folder("btmp",borgeh);
        Folder cdiv = new Folder("cdiv",carsten);
        // System.out.println(home);
        // System.out.println(btmp);

        // home.printTree();
        // cdiv.move(bdiv);
        // System.out.println(cdiv);
        // home.printTree();
        // System.out.println("Før flytte borgeh");
        // System.out.println(borgeh.getFolders());
        // System.out.println(carsten.getFolders());

        // borgeh.move(cdiv);
        // home.printTree();
        // borgeh.printTree();

        // for (int i = 0; i < 30; i++) {
        //     Folder tmp = new Folder("folder"+i, home);
        // }
        // for (Folder folder : home.getFolders()) {
        //     for (int i = 0; i < 30; i++) {
        //         Folder tmp = new Folder("folder"+i, folder);
        //     }    
        // }
        // System.out.println(home.contains(cdiv));

        File fil1 = new File("fil.txt", home);
        File fil2 = new File("fil.txt", borgeh);
        System.out.println(home.findAll("home"));



        

    }



}
