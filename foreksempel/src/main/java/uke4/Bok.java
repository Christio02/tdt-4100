package uke4;

public class Bok {

    private String tittel; // tilstander
    private int antallSider;
    private int hvorLangtLest;

    public Bok(String tittel, int antallSider) { // constructor
        super();
        this.tittel = tittel;
        this.antallSider = antallSider;
    }

    public Bok(String tittel, int antallSider, int hvorLangtLest) {
        super();
        if (!this.kanLeseSider(antallSider)) {
            throw new IllegalStateException("Kan ikke lese lenger en totalt sider i boken"); // Customize error handling
        }
        this.tittel = tittel;
        this.antallSider = antallSider;
        this.hvorLangtLest = hvorLangtLest;
    }

    public String getTittel() { // get tittel
        return tittel;
    }

    @Override
    public String toString() { // to String method
        return tittel + " (" + hvorLangtLest + "/" + antallSider + ")";
    }

    private boolean kanLeseSider(int sider) { // return true if you've read less than total pages
        return (sider + hvorLangtLest) <= antallSider; // return påstand? Hvis sann, return blah blah etc
    }

    private void lestSider(int siderLest) { // add pages if kanLeseSider is true
        if (kanLeseSider(siderLest)) {
            hvorLangtLest += siderLest;
        } else {
            throw new IllegalStateException("Du prøver å lese flere sider enn boken!");
        }
    }

    public static void main(String[] args) {
        Bok bok = new Bok("Game of Thrones", 700);
        System.out.println(bok);

        try {
            bok.lestSider(2000);
            System.out.println(bok);
        } catch (Exception e) {
            System.out.println("Feil utløst");

        }

        Bok bok2 = new Bok("Rødhette", 23);
        System.out.println(bok2);
    }
}
