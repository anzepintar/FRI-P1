
import java.util.*;

public abstract class Lik implements Comparable<Lik> {

    public abstract int ploscina();

    public abstract int obseg();

    public String toString() {
        return String.format("%s [%s]", this.vrsta(), this.podatki());
    }

    // Vrne vrsto lika <this> (npr. "pravokotnik").
    public abstract String vrsta();

    // Vrne niz s podatki o liku <this>
    // (npr. "širina = 3.0, višina = 4.0").
    public abstract String podatki();

    @Override
    public int compareTo(Lik drugi) {
        return this.ploscina() - drugi.ploscina();
    }

    public static Comparator<Lik> poObsegu() {
        return new PrimerjalnikPoObseegu();
    }

    private static class PrimerjalnikPoObseegu implements Comparator<Lik> {
        @Override
        public int compare(Lik prvi, Lik drugi) {
            return prvi.obseg() - drugi.obseg();
        }
    }

    public static Comparator<Lik> poTipu() {
        return new PrimerjalnikPoTipu();
    }

    private static class PrimerjalnikPoTipu implements Comparator<Lik> {
        @Override
        public int compare(Lik prvi, Lik drugi) {
            return indeksTipa(prvi) - indeksTipa(drugi);
        }

        private static int indeksTipa(Lik lik) {
            if (lik.vrsta().equals("krog")) {
                return 2;
            }
            if (lik.vrsta().equals("kvadrat")) {
                return 1;
            } else
                return 0;
        }

    }

    /*
     * public static void urediPoTipuInObsegu(Vektor<Lik> vektor) {
     * int steviloElementov = vektor.steviloElementov();
     * for (int i = 1; i < steviloElementov; i++) {
     * Lik element = vektor.vrni(i);
     * int j = i - 1;
     * while (j >= 0 && vektor.vrni(j).compareTo(element) > 0) {
     * vektor.nastavi(j + 1, vektor.vrni(j));
     * j--;
     * }
     * vektor.nastavi(j + 1, element);
     * }
     * }
     */

    static void urediPoTipuInObsegu(Vektor<Lik> vektor) {
        Skupno.uredi(vektor, Skupno.kompozitum(poTipu(), poObsegu()));
    }

    public static void izpisi(Vektor<Lik> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 0; i < stElementov; i++) {
            Lik lik = vektor.vrni(i);
            System.out.printf("%s | p = %d | o = %d%n",
                    lik.toString(), lik.ploscina(), lik.obseg());
        }
    }

}
