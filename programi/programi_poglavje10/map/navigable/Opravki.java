
//
// Prikaz delovanja metod vmesnika NavigableMap.
//

import java.util.*;

public class Opravki {

    public static void main(String[] args) {

        NavigableMap<Cas, String> opravki = new TreeMap<>(Map.of(
            new Cas(8, 15), "predavanja",
            new Cas(11, 10), "govorilne ure",
            new Cas(12, 30), "kosilo",
            new Cas(14, 0), "sestanek",
            new Cas(18, 30), "večerja"
        ));
        System.out.println(opravki);
        System.out.println();

        Cas poldan = new Cas(12, 0);

        // prvi popoldanski termin
        System.out.println("--- higherKey ---");
        System.out.println(opravki.higherKey(poldan));
        System.out.println();

        // zadnji dopoldanski par termin-dejavnost
        System.out.println("--- lowerEntry ---");
        Map.Entry<Cas, String> par = opravki.lowerEntry(poldan);
        System.out.println(par.getKey());
        System.out.println(par.getValue());
        System.out.println();

        // slovar dopoldanskih opravkov
        System.out.println("--- headMap ---");
        Map<Cas, String> dopoldanski = opravki.headMap(poldan, true);
        System.out.println(dopoldanski);

        // dodajmo še en dopoldanski opravek
        dopoldanski.put(new Cas(6, 10), "tek");

        System.out.println(dopoldanski);
        System.out.println(opravki);
    }
}
