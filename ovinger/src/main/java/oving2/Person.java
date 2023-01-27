package oving2;

import java.util.Date;

public class Person {
    // states
    private String name;
    private String email;

    private Date birthdate;
    private char gender;

    // constructor
    public Person() {
    
    }

    

    // setters

    // sets name
    public boolean validateName(String name) {

        String[] parts = name.split(" "); // creates an array of first and lastname

        if (parts.length != 2) { // checks if array has exactly two elements (no middle name)
            return false;
        }

        if (!parts[0].matches("[a-øA-Ø]+")) {
            return false;
        }

        // check if the second element contains only alphabetical letters
        if (!parts[1].matches("[a-øA-Ø]+")) {
            return false;
        }

        if (parts[0].length() <= 2 || parts[1].length() <= 2) { // checks if length of the names are more or equal to
                                                                // two
            return false;
        }

        // if all checks pass, return true
        return true;

    }

   
    public void setName(String name) {
        if (!validateName(name)) {
            throw new IllegalArgumentException(
                    "Feil format på navn!; bare bokstaver, må ha etternavn men ikke mellomnavn, eller navenene er for korte!");
        }
        this.name = name;
    }

    // gets fullname
    public String getName() {
        return name;
    }

    // sets birthday

    public void setBirthday(Date birthdate) {
        Date today = new Date();
        if (birthdate.compareTo(today) > 0) { // checks if birtday is newer than todays date
            throw new IllegalArgumentException("Kan ikke ha bursdag fram i tid!");
        }
        this.birthdate = birthdate;
    }

    // gets birtday
    public Date getBirthday() {
        return this.birthdate;
    }

    // sets email
    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Email formatet er feil! Sjekk input, bør være på formatet: fornavn.etternavn@domene.landskode ");
        }
        this.email = email;

    }

    
    // check if email is valid
    public boolean isValidEmail(String email) {

        String pattern = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"; // pattern for validation of email                                              // of email
        if (email.matches(pattern)) {
            return true;

        } else {
            return false;
        }

    }

    public String getEmail() {
        return this.email;
    }


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
        return "Person [name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }



    public static void main(String[] args) {
        Person p1 = new Person("Christopher Høe", "christopher.hoee@gmail.com", 'M');

        System.out.println(p1);

    }

}
