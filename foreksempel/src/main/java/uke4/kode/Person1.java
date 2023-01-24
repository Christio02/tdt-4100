package uke4.kode;

public class Person1 {

    // states, should always be private
    private String firstName;
    private String lastName;
    
    // constructor

    public Person1(String firstName, String lastName) {
        setFirstName(firstName); // using set methods to set firstname and lastname
        setLastName(lastName);
    }





    // getters and setters

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() { // gets the full name for the object
        return this.firstName + " " + this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullName(String fullName) {
        
        String fornavn = fullName.split(" ")[0];
        String etternavn = fullName.split(" ")[1];

        this.firstName = fornavn;
        this.lastName = etternavn;
    }

    @Override
    public String toString() {
        return getFullName(); // should return the getter for fullname
    }

    public static void main(String[] args) {

        Person1 p1 = new Person1("Chris", "Hoe");

        p1.setFirstName("Malena");

        p1.setLastName("Hansen");

        p1.setFullName("Figma Balls");

        System.out.println(p1);
    }
}
