
import java.util.*;

/*
 * Razred, ki vsebuje metodo za urejanje vektorja po naravni urejenosti
 * njegovih elementov in metodo za urejanje vektorja glede na podani
 * primerjalnik.  Obe metodi uporabljata algoritem navadnega vstavljanja.
 */

public class Urejanje {

    // Uredi podani vektor po naravni urejenosti njegovih elementov.
    // Tip T mora biti podtip tipa Comparable<T>, da lahko nad njegovimi
    // objekti kličemo metodo compareTo.

    public static <T extends Comparable<T>> void uredi(Vektor<T> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1; i < stElementov; i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && vektor.vrni(j).compareTo(element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }

    // Uredi podani vektor glede na podani primerjalnik. Pri tipu T tokrat ni
    // nobenih omejitev, saj objekte tipa T med seboj primerjamo s
    // *primerjalnikovo* metodo compare.

    public static <T> void uredi(Vektor<T> vektor, Comparator<T> primerjalnik) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1; i < stElementov; i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && primerjalnik.compare(vektor.vrni(j), element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }
}
