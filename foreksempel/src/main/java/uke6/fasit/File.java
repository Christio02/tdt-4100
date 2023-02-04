package uke6.fasit;

public class File {
    
    String name;
    Folder parent;

    public String getName() {
        return name;
    }

    public Folder getParent() {
        return parent;
    }

    public File(String name, Folder parent) {
        //TODO
    }

    
    @Override
    public String toString() {
        return getName();
    }

    public void move(Folder destination) {
    // TODO
    }
}
