package of0.kode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Itgk {

    static boolean TreLike(String s1, String s2) {
        if (s1.substring(0, 3).toLowerCase().equals(s2.substring(0, 3).toLowerCase())) {
            return true;
        }
        else {
            return false;
        }
    }

    static int SumPosOdd(List<Integer> liste) {
        int s = 0;

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) % 2 != 0 && liste.get(i) > 0) {
                s+=liste.get(i);
            }
        }
        return s;
        
    }


    static ArrayList<String> SplitString(String s, String bokstav) {
        String[] splitted = s.split(bokstav, -1);
        return new ArrayList<>(List.of(splitted));

    }

    public static void main(String[] args) {

        // System.out.println(Itgk.TreLike("Bord", "BoRReMaskin"));
        // System.out.println(Itgk.TreLike("Java", "Python"));

        List<Integer> list = new ArrayList<>(List.of(2, -3, 5, -1, 7, 6, 4));

        System.out.println(Itgk.SumPosOdd(list));

        // String s = "Hakuna Matata";
        // String karakter = "a";
        // System.out.println(SplitString(s, karakter));

        

    }
}
