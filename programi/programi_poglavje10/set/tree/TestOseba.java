
//
// Množica tipa TreeSet z elementi tipa Oseba.
//

import java.util.*;

public class TestOseba {

    public static void main(String[] args) {
        Oseba[] osebe = {
            new Oseba("Janez", "Novak", 'M', 1970),
            new Oseba("Janez", "Novak", 'M', 1952),
            new Oseba("Jan",   "Novak", 'M', 1970),
            new Oseba("Mojca", "Novak", 'Z', 1982),
            new Oseba("Mojca", "Pirc",  'Z', 1954),
            new Oseba("Ivan",  "Pirc",  'M', 1973),
            new Oseba("Darja", "Fink",  'Z', 1954)
        };

        Set<Oseba> a = new TreeSet<>();
        for (Oseba oseba: osebe) {
            a.add(oseba);
        }
        System.out.println(a);

        Set<Oseba> b = new TreeSet<>(Oseba.primerjalnikPoSpoluInStarosti());
        for (Oseba oseba: osebe) {
            b.add(oseba);
        }
        System.out.println(b);
    }
}
