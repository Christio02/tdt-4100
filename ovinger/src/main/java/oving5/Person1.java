package oving5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person1 implements Named {

    private String givenName;
    private String familyName;

    public Person1 (String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
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
    public void setFullName(String fullName) {
        String [] names = fullName.split(" ");
        setGivenName(names[0]);
        setFamilyName(names[1]);
        
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
        
    }

    
}

