
import java.util.*;

/*
 * Razred, ki testira implementacijo vmesnika Iterable v razredu Slovar in
 * sprehod po ključih slovarja s pomočjo vrnjenega iteratorja.
 */

public class TestSlovar {

    public static void main(String[] args) {
        Slovar<String, Integer> drzava2sosede = new Slovar<>();
        drzava2sosede.shrani("Slovenija", 4);
        drzava2sosede.shrani("Nemčija", 9);
        drzava2sosede.shrani("Malta", 0);
        drzava2sosede.shrani("Norveška", 3);
        drzava2sosede.shrani("Rusija", 14);

        for (String drzava: drzava2sosede) {
            System.out.printf("%s -> %d%n", drzava, drzava2sosede.vrni(drzava));
        }
        System.out.println();

        // enakovredno:
        Iterator<String> iterator = drzava2sosede.iterator();
        while (iterator.hasNext()) {
            String drzava = iterator.next();
            System.out.printf("%s -> %d%n", drzava, drzava2sosede.vrni(drzava));
        }
    }
}
