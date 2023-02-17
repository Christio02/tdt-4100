package oving5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person1 implements Named {

    private String givenName;
    private String familyName;

    public Person1 (String givenName, String familyName) {
        setFullName(givenName, familyName);
    }

    @Override
    public void setGivenName(String givenName) {
        this.givenName = givenName;
        
    }

    @Override
    public String getGivenName() {
        return this.givenName;
    }

    @Override
    public void setFamiliyName(String familyName) {
        this.familyName = familyName;
        
    }

    @Override
    public String getFamilyName() {
        return this.familyName;
        
    }

    @Override
    public void setFullName(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
        
    }

    @Override
    public String getFullName() {
        return givenName + " " + familyName;
    }

    @Override
    public String toString() {
        return "GivenName: " + getGivenName() + " " + "FamilyName: " +  getFamilyName() + "\n" + "Fullname: " + getFullName();
        
        
    }

    public static void main(String[] args) {
        Person1 p1 = new Person1("Christopher", "Hansen");
        Person2 p2 = new Person2("Malena Sletten");
        System.out.println(p1.getFullName());
        System.out.println(p2.getFullName());

        List<Named> sortedAlpBName = new ArrayList<>();
        sortedAlpBName.add(p1);
        sortedAlpBName.add(p2);

        // Collections.sort(sortedAlpBName, new NamedComparator());
        // System.out.println(sortedAlpBName);
        
    }

    
}

