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
    public void setFamilyName(String familyName) {
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
        return "FullName: " + getFullName();
        
        
    }

    public static void main(String[] args) {
        Person1 p1 = new Person1("Christopher", "Trætteberg");
        Person2 p2 = new Person2("Mats Trætteberg");

        System.out.println(p1.getFullName());
        System.out.println(p2.getFullName());

        p2.setFamilyName("Hansen");
        List<Named> sortedAlpBName = new ArrayList<>();
        sortedAlpBName.add(p1);
        sortedAlpBName.add(p2);

        System.out.println(sortedAlpBName);
        System.out.println("\n");

        Collections.sort(sortedAlpBName, new NamedComparator());
        System.out.println(sortedAlpBName);
        
    }

    
}

