package uke4.kode;

public class Person2 {
    
    private String fullName;

    // constructor

    public Person2(String firstName, String lastName) {
        setFullName(firstName + " " + lastName);

    }

    // getters and setters

    public String getFirstName() {
        return this.fullName.split(" ")[0];
    }

    public String getLastName() {
        return this.fullName.split(" ")[1];
    }

    public String getFullName() { // gets the full name for the object
        return this.fullName;
    }

    public void setFirstName(String firstName) {
        
        String etternavn = this.fullName.split(" ")[1];

        this.fullName = firstName + " " + etternavn;
    }

    
    public void setLastName(String lastName) {
        
        String fornavn = this.fullName(" ")[0];

        this.fullName = fornavn + " " + lastName;
        
    }

    private String[] fullName(String string) {
        return null;
    }

    public void setFullName(String fullName) {
        
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return getFullName(); // should return the getter for fullname
    }





    public static void main(String[] args) {

        Person2 p1 = new Person2("Chris", "Hoe");

        p1.setFirstName("Malena");

        p1.setLastName("Hansen");

        p1.setFullName("Figma Balls");

        System.out.println(p1);
        
    }
}
