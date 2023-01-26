package oving2;

import java.util.Date;

public class Person {
    // states
    private String name;
    private String email;

    private Date birthdate;
    private char gender;

    // constructior

    // public Person(String firstname, String lastname, Date birthdate, char gender)
    // {
    // setName(firstname + " " + lastname); // remember to call method in
    // constructor
    // setBirthday(birthdate);

    // }

    // setters

    // sets name
    public void setName(String name) {
        if (name.split(" ").length > 2) {
            throw new IllegalArgumentException("Kan ikke ha mellomnavn!");
        }
        // need to split name
        String firstname = name.split(" ")[0];
        String lastname = name.split(" ")[1];

        if (firstname.length() < 2 || lastname.length() < 2) {
            throw new IllegalArgumentException("Fornavn og etternavn må være på minst 2 bokstaver!");
        }
        this.name = firstname + " " + lastname;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            if (Character.isDigit(c)) { // goes through fullname and checks if it contains numbers
                throw new IllegalArgumentException("Fornavn eller etternavn inneholder tall!");
            }
        }
    }

    // gets fullname
    public String getName() {
        return name;
    }

    // sets birthday

    public void setBirthday(Date birthDate) {
        Date today = new Date();
        if (birthDate.compareTo(today) > 0) { // checks if birtday is newer than todays date
            throw new IllegalArgumentException("Kan ikke ha bursdag fram i tid!");
        }
        this.birthdate = birthDate;
    }

    // gets birtday
    public Date getBirthday() {
        return this.birthdate;
    }

    // sets email
    public void setEmail(String email) {

    }

    // check if email is valid
    // public boolean isValidEmail(String email) {

    // }

    // sets gender

    public void setGender(char gender) {
        if (gender != 'M' && gender != 'F' && gender != '\0') {
            throw new IllegalArgumentException("Kjønn må enten være M, F eller 0");

        } 
        
        this.gender = gender;
    }

    // get gender

    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {

        // should throw error
        // Person p2 = new Person("D", "H");

    }

}
