
//
// Preizkus metod iz vmesnika NavigableSet.
//

import java.util.*;

public class TestStevila {

    public static void main(String[] args) {
        NavigableSet<Integer> mnozica = new TreeSet<>(Set.of(10, 20, 30, 40, 50));
        NavigableSet<Integer> podmnozica = mnozica.headSet(30, true);

        System.out.println(mnozica);
        System.out.println(podmnozica);
        System.out.println();

        podmnozica.add(5);
        System.out.println(podmnozica);
        System.out.println(mnozica);
        System.out.println();

        mnozica.remove(20);
        System.out.println(podmnozica);
        System.out.println(mnozica);

        // podmnozica.add(35);   // sproži se izjema tipa IllegalArgumentException
    }
}
