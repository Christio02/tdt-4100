package oving2;

import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;

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
    private boolean validateName(String name) {

        String[] parts = name.split(" "); // creates an array of first and lastname

        if (parts.length != 2) { // checks if array has exactly two elements (no middle name)
            return false;
        }
        // check if the firstname and lastname have valid letters
        if (!parts[0].matches("[a-øA-Ø]+")) {
            return false;
        }

        if (!parts[1].matches("[a-øA-Ø]+")) {
            return false;
        }

        if (parts[0].length() <= 2 || parts[1].length() <= 2) { // checks if length of the names are more or equal to 2

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
        if (!isValidEmail(email, name)) {
            throw new IllegalArgumentException(
                    "Email formatet er feil! Sjekk input, bør være på formatet: fornavn.etternavn@domene.landskode ");
        }
        this.email = email;

    }

    // check if email is valid
    private boolean isValidEmail(String email, String name) {


        String pattern = "^[a-øA-Ø0-9_!#$%&`*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"; // pattern for validation

        if (!email.matches(pattern)) { // checks if email has correct format
            return false;

        }

        // need to split firstname and lastname from email and validate upon name

        String[] emailParts = email.split(Pattern.quote(".") + "|" + Pattern.quote("@")); // splits email on periods and   // at-sign

                                                                                        
        if (!emailParts[0].equalsIgnoreCase(parts[0])) {
            return false;
        }

        if (!emailParts[1].equalsIgnoreCase(parts[1])) {
            return false;
        }

        String[] cTLDs = { "ad", "ae", "af", "ag", "ai", "al", "am", "ao", "aq", "ar", "as", "at", "au", "aw", "ax",
                "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bl", "bm", "bn", "bo", "bq", "br", "bs",
                "bt", "bv", "bw", "by", "bz", "ca", "cc", "cd", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", "co",
                "cr", "cu", "cv", "cw", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "eh",
                "er", "es", "et", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gg", "gh", "gi",
                "gl", "gm", "gn", "gp", "gq", "gr", "gs", "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu",
                "id", "ie", "il", "im", "in", "io", "iq", "ir", "is", "it", "je", "jm", "jo", "jp", "ke", "kg", "kh",
                "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu",
                "lv", "ly", "ma", "mc", "md", "me", "mf", "mg", "mh", "mk", "ml", "mm", "mn", "mo", "mp", "mq", "mr",
                "ms", "mt", "mu", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np",
                "nr", "nu", "nz", "om", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "ps", "pt", "pw",
                "py", "qa", "re", "ro", "rs", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk",
                "sl", "sm", "sn", "so", "sr", "ss", "st", "sv", "sx", "sy", "sz", "tc", "td", "tf", "tg", "th", "tj",
                "tk", "tl", "tm", "tn", "to", "tr", "tt", "tv", "tw", "tz", "ua", "ug", "um", "us", "uy", "uz", "va",
                "vc", "ve", "vg", "vi", "vn", "vu", "wf", "ws", "ye", "yt", "za", "zm", "zw" };

            if (!(Arrays.asList(cTLDs).contains(emailParts[3]))) {
                return false;
            }  
        

        return true;
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
<<<<<<< HEAD
=======
        Person p1 = new Person();
        p1.setName("Christopher Hoee");
        p1.setEmail("christopher.hoee@gmail.com");
        p1.setGender('M');
        System.out.println(p1);
>>>>>>> f70f3455db745c68a656ba6a741398b041b42454

    }

}
