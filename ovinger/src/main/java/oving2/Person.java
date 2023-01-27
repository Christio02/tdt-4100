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
    public void setName(String name) {

        if (!name.contains(" ")) { // Checks if name contains whitespace to determine if it has a surname or not

            throw new IllegalArgumentException("Navnet har ikke etternavn!");
        }

        for (int i = 0; i < name.length(); i++) {
            char d = name.charAt(i);
            if (!Character.isLetter(d)) { // goes through string to look for illegal characters, name.trim() removes whitespace so that isletter does not trigger
                throw new IllegalArgumentException("Navnet kan bare inneholde bokstaver!");
            }
            else if (name.trim() == "") {

            }
        }
        
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
        return "Person [name=" + name + ", gender=" + gender + "]";
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Christopher Høe");
        System.out.println(p1);

    }

}
