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

    public String getTittel() { // get tittel
        return tittel;
    }

    @Override
    public String toString() { // to String method
        return tittel+" ("+hvorLangtLest+"/"+antallSider+")";
    }

    private boolean kanLeseSider(int sider) { // return true if you've read less than total pages
        if ((hvorLangtLest + sider) <= antallSider) {
            return true;
        }
        return false;
    } 

    private void lestSider(int siderLest) { // add pages if kanLeseSider is true
        if (kanLeseSider(siderLest)) {
            hvorLangtLest += siderLest;
        }
        else {
            System.out.println("kan Ikke lese ");
        }
    }

    public static void main(String[] args) {
        Bok bok = new Bok("1984", 167);
        System.out.println(bok.toString());

        bok.lestSider(20);
        System.out.println(bok);
        bok.lestSider(2000);
        System.out.println(bok);



    }
}
