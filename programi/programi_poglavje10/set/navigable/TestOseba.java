
//
// Preizkus metod iz vmesnika NavigableSet.
//

import java.util.*;

public class TestOseba {

    public static void main(String[] args) {
        NavigableSet<Oseba> osebe = new TreeSet<>(Set.of(
            new Oseba("Janez", "Novak", 'M', 1970),
            new Oseba("Jan",   "Novak", 'M', 1970),
            new Oseba("Mojca", "Novak", 'Z', 1982),
            new Oseba("Mojca", "Pirc",  'Z', 1954),
            new Oseba("Ivan",  "Pirc",  'M', 1973),
            new Oseba("Darja", "Fink",  'Z', 1954)
        ));

        System.out.println(osebe.first());
        System.out.println(osebe.last());

        Oseba mejna = new Oseba("Katja", "Novak", 'Z', 1975);
        System.out.println(osebe.floor(mejna));
        System.out.println(osebe.ceiling(mejna));
    }
}
