package uke4;

public class Bok {
    
    private String tittel; // tilstander
    private int antallSider;
    private int hvorLangt; // should start at 0
     

    // constructor 
    public Bok(String tittel, int antallSider) {
        super();
        this.tittel = tittel;
        this.antallSider = antallSider;
    }


    public String getTittel() {
        return tittel;
    }

    public int getAntallSider() {
        return antallSider;
    }

    private void lestSider(int siderLest) {
        if(kanLeseSider(siderLest)) {
            hvorLangt += siderLest;
        }
        else {
            System.out.println("Kan ikke lese");
        }
    }

    private boolean kanLeseSider(int sider) {
        if ((hvorLangt + sider) <= antallSider) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return tittel + ": " + "" + "/" + " " + antallSider;
    }
    
    public static void main(String[] args) {
        Bok bok = new Bok("Game of Thrones", 700);
        
        System.out.println(bok);
    
        bok.lestSider(30);
        System.out.println(bok);
    }


    
 
}
