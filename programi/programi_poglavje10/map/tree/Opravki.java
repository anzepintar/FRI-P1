
//
// Prikaz obnašanja slovarja tipa TreeMap.
//

import java.util.*;

public class Opravki {

    public static void main(String[] args) {
        // metoda Map.of ustvari nespremenljiv slovar, a ga lahko podtaknemo
        // konstruktorju razreda HashMap ali TreeMap in dobimo običajen
        // spremenljiv slovar
        Map<Cas, String> opravki = new TreeMap<>(Map.of(
            new Cas(8, 15), "predavanja",
            new Cas(11, 10), "govorilne ure",
            new Cas(12, 30), "kosilo",
            new Cas(14, 0), "sestanek",
            new Cas(18, 30), "večerja"
        ));
        System.out.println(opravki);
        System.out.println();

        // izpišimo slovar s sprehodom po množici parov ključ-vrednost
        for (Map.Entry<Cas, String> par: opravki.entrySet()) {
            System.out.printf("%s -> %s%n", par.getKey(), par.getValue());
        }
    }
}
