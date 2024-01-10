
import java.util.*;

/*
 * Razred, ki testira implementacijo vmesnika Iterable v razredu Vektor in
 * sprehod po vektorju s pomočjo vrnjenega iteratorja.
 */

public class TestVektor {

    public static void main(String[] args) {
        Vektor<Cas> casi = new Vektor<>();
        casi.dodaj(new Cas(11, 20));
        casi.dodaj(new Cas(8, 50));
        casi.dodaj(new Cas(17, 40));
        casi.dodaj(new Cas(10, 5));
        casi.dodaj(new Cas(3, 10));

        for (Cas cas: casi) {
            System.out.println(cas);
        }
        System.out.println();

        // enakovredno:
        Iterator<Cas> iterator = casi.iterator();
        while (iterator.hasNext()) {
            Cas cas = iterator.next();
            System.out.println(cas);
        }
    }
}
