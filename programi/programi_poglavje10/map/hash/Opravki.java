
//
// Prikaz obnašanja slovarja tipa HashMap.
//

import java.util.*;

public class Opravki {

    public static void main(String[] args) {
        // ustvarimo slovar in vanj dodajmo nekaj parov termin-dejavnost
        System.out.println("--- put (novi pari ključ-vrednost) ---");
        Map<Cas, String> opravki = new HashMap<>();
        opravki.put(new Cas( 8, 15), "predavanja");
        opravki.put(new Cas(11, 10), "govorilne ure");
        opravki.put(new Cas(12, 30), "kosilo");
        opravki.put(new Cas(14,  0), "sestanek");
        opravki.put(new Cas(18, 30), "večerja");
        System.out.println(opravki);
        System.out.println();

        // pridobimo vrednosti za obstoječ in neobstoječ ključ
        System.out.println("--- get ---");
        System.out.println(opravki.get(new Cas(14, 0)));
        System.out.println(opravki.get(new Cas(12, 0)));
        System.out.println();

        // preverimo prisotnost ključa
        System.out.println("--- containsKey ---");
        System.out.println(opravki.containsKey(new Cas(8, 15)));
        System.out.println();

        // odstranimo par ključ-vrednost
        System.out.println("--- remove ---");
        opravki.remove(new Cas(14, 0));
        System.out.println(opravki);
        System.out.println();

        // spremenimo vrednost, prirejeno enemu od ključev
        System.out.println("--- put (sprememba vrednosti za ključ) ---");
        opravki.put(new Cas(18, 30), "tenis");
        System.out.println(opravki);
        System.out.println();

        // izpišimo slovar s sprehodom po množici ključev
        System.out.println("--- keySet ---");
        for (Cas cas: opravki.keySet()) {
            System.out.printf("%s -> %s%n", cas, opravki.get(cas));
        }
    }
}
