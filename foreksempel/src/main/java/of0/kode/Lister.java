package of0.kode;

import java.util.ArrayList;
import java.util.List;

public class Lister {

    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>();

        liste.add("Figma");
        liste.add("Balls");
        liste.add("Man city");

        System.out.println(liste.get(1));
        System.out.println(liste);

        ArrayList<Number> tall = new ArrayList<>(List.of(2, 1.2, 5));
        System.out.println(tall.size());
    }
}
