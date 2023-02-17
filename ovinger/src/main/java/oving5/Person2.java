package oving5;

public class Person2 implements Named {

    private String fullName;
    private Person1 p1;

    public Person2(String fullName) {
        this.fullName = fullName;
    }


    @Override
    public void setGivenName(String givenName) {
        int indexOfSpace = this.fullName.indexOf(" ");
        String thisGivenName = this.fullName.substring(0, indexOfSpace - 1);
        thisGivenName = givenName;
        this.fullName.replaceAll(thisGivenName, givenName);

    }


    @Override
    public String getGivenName() {
        int indexOfSpace = this.fullName.indexOf(" ");
        return fullName.substring(0, indexOfSpace);
    }


    @Override
    public void setFamiliyName(String familyName) {
        int indexOfSpace = this.fullName.indexOf(" ");
        String thisFamilyName = this.fullName.substring(indexOfSpace + 1, this.fullName.length());
        thisFamilyName = familyName;
        this.fullName.replaceAll(thisFamilyName, familyName);
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