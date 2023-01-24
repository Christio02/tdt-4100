package oving2;

import java.util.Date;

public class Person {
    // states
    private String name;
    private String email;

    private Date birthdate;
    private char gender;

    // constructior

    public Person(String firstname, String lastname) {
        setName(firstname, lastname); // remember to call method in constructor
    }

    // setters

    // sets name
    public void setName(String firstname, String lastname) {
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

    // sets email
    public void setEmail(String email) {

    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Chris", "Høe");
        System.out.println(p1);
        // should throw error
        // Person p2 = new Person("D", "H");

    }

}
