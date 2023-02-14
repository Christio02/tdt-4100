package oving4;

import java.util.ArrayList;

import java.util.List;

public class Person {

    private String name;
    private char gender;
    List<Person> barn = new ArrayList<>();

    public Person(String name, char gender) {
        this.name = name;
        if (gender != 'M' && gender != 'F') {
            throw new IllegalArgumentException("Feil type kjønn!");
        }
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }


    // children methods

    public void addChild(Person child) {

        if (this.getGender() == 'F') {
            child.setMother(this);
        }
        
        if (this.getGender() == 'M') {
            child.setFather(this);
        }
    }

    // mother/father methods

    public void setMother(Person mother) {
        this.addChild(this);

    }

    public void setFather(Person father) {
    
    }



    @Override
    public String toString() {
        return  "[ Name: " + getName() + " |" +  " Gender: " + getGender() + " ]";
    }
    
    public static void main(String[] args) {
        
        Person far = new Person("Mats", 'M');
        Person mor = new Person("Marie", 'F');
        Person barn1 = new Person("Andreas", 'M');

        far.addChild(barn1);
        mor.addChild(barn1);


    }
    
}
