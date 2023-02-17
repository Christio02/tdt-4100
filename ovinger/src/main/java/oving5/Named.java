package oving5;

public interface Named {

    void setGivenName(String givenName);
    String getGivenName();
    void setFamiliyName(String familyName);
    String getFamilyName();
    // should concate the two strings
    void setFullName(String givenName, String familyName); 
    String getFullName();
    

}
