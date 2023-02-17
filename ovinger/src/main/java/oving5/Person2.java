package oving5;

public class Person2 implements Named {

    private String fullName;

    public Person2(String fullName) {
        this.fullName = fullName;
    }


    @Override
    public void setGivenName(String givenName) {
        int indexOfSpace = this.fullName.indexOf(" ");
        String thisGivenName = this.fullName.substring(0, indexOfSpace - 1);
        String newFullName = this.fullName.replaceAll(thisGivenName, givenName);
        
        this.fullName = newFullName;

    }


    @Override
    public String getGivenName() {
        int indexOfSpace = this.fullName.indexOf(" ");
        return fullName.substring(0, indexOfSpace);
    }


    @Override
    public void setFamilyName(String familyName) {
        int indexOfSpace = this.fullName.indexOf(" "); // get the index of the space in the full name
        String thisFamilyName = this.fullName.substring(indexOfSpace + 1, this.fullName.length()); // replace the family name in the full name with the new one
        String newFullName = this.fullName.replaceAll(thisFamilyName, familyName);

        this.fullName = newFullName; // set fullname to temp string
    }


    @Override
    public String getFamilyName() {
        int indexOfSpace = this.fullName.indexOf(" ");
        return fullName.substring(indexOfSpace + 1, fullName.length());
    }


    @Override
    public void setFullName(String givenName, String familyName) {
        this.fullName = givenName + " " + familyName;
    }


    @Override
    public String getFullName() {
        return this.fullName;
    }


    @Override
    public String toString() {
        return "Fullname: "  + getFullName();
    }
    


}