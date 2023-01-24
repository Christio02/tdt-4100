package oving2;

import java.util.Date;
public class Person {
    // states
    private String fullname;
    private String fornavn;
    private String etternavn;
    private String epost;

    private Date fodselsDag;
    private char kjonn;

    // constructior

    public Person(String fornavn, String etternavn, String epost, Date fodselsDag, char kjonn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.epost = epost;
        this.fodselsDag = fodselsDag;
        this.kjonn = kjonn;
    }

    // setters

    // sets fullname
    public void setName(String fornavn, String etternavn) {
        if (fornavn.length() < 2 || etternavn.length() < 2) {
            throw new IllegalArgumentException("Fornavn og etternavn må være på minst 2 bokstaver!");
        }
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fullname = this.fornavn + " " + this.etternavn;
    }

    





    

}
