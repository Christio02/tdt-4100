package uke4.kode.carworld;

public class Plate {

    private String regNr;
    
    public Plate(String regNr) {
        if (Plate.isValid(regNr)) { // is accessed in a static way
            this.regNr = regNr;
        }
        else {
            throw new IllegalArgumentException("Ikke gyldig regnr!!");
        }
    }

    public static boolean isValid(String regNr) {

        if (regNr.length() != 7) {
            return false;
        }
            // nå vet vi at lengden er 7

        for (int i = 0;  i < regNr.length(); i++) {
            char c = regNr.charAt(i); // i python regNr[i]

            if (i < 2) { // sjekker om de 2 første er tall 
                if (!Character.isAlphabetic(c)) {
                    return false;
                }
            }
            else { // sjekker om de siste chars er tall
                if (!Character.isDigit(c)) {
                    return false;
                }
            }


        }

        return true;
    }

    

    @Override
    public String toString() {
        return "Plate [regNr=" + regNr + "]";
    }

    public static void main(String[] args) {

        Plate p = new Plate("AB12345");
        System.out.println(Plate.isValid("AB12345"));
        System.out.println(p);
    }
}
