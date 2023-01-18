package of0.kode;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    public static void main(String[] args) {

        Map<String, Integer> filosofer = new HashMap<String, Integer>(
                Map.of("Platon", -428, "Hume", 1711, "Aristoteles", -384, "Descartes", 1596));

        System.out.println(filosofer);

        filosofer.put("Popper", 1902);
        System.out.println(filosofer);

        filosofer.remove("Hume");
        System.out.println(filosofer);

        System.out.println(filosofer.size());

    }
}
