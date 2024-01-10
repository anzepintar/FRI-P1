
import java.util.*;

/*
 * Razred Vektor, dopolnjen tako, da implementira vmesnik Iterable.
 */

public class Vektor<T> implements Iterable<T> {

    private static final int ZACETNA_KAPACITETA = 10;

    // tabela, ki hrani elemente
    private T[] elementi;

    // dejansko število elementov v tabeli
    private int stElementov;

    @SuppressWarnings("unchecked")
    public Vektor() {
        this.elementi = (T[]) new Object[ZACETNA_KAPACITETA];
        this.stElementov = 0;  // odveč, a poveča jasnost
    }

    // Vrne število elementov vektorja this.
    public int steviloElementov() {
        return this.stElementov;
    }

    // Vrne element vektorja this na podanem indeksu.
    public T vrni(int indeks) {
        return this.elementi[indeks];
    }

    // Element na podanem indeksu nastavi na podano vrednost.
    public void nastavi(int indeks, T vrednost) {
        this.elementi[indeks] = vrednost;
    }

    // Doda element na konec vektorja (na indeks this.stElementov).
    public void dodaj(T vrednost) {
        this.poPotrebiPovecaj();
        this.elementi[this.stElementov] = vrednost;
        this.stElementov++;
    }

    // Vstavi element s podano vrednostjo pred element s podanim
    // indeksom.
    public void vstavi(int indeks, T vrednost) {
        this.poPotrebiPovecaj();
        for (int i = this.stElementov - 1;  i >= indeks;  i--) {
            this.elementi[i + 1] = this.elementi[i];
        }
        this.elementi[indeks] = vrednost;
        this.stElementov++;
    }

    // Izloči element na podanem indeksu.
    public void odstrani(int indeks) {
        for (int i = indeks;  i < this.stElementov - 1;  i++) {
            this.elementi[i] = this.elementi[i + 1];
        }
        this.stElementov--;
    }

    // Če je trenutno število elementov v vektorju enako
    // njegovi kapaciteti, ga "raztegne" (ustvari novo, večjo 
    // tabelo in vanjo skopira elemente trenutne tabele).
    @SuppressWarnings("unchecked")
    private void poPotrebiPovecaj() {
        if (this.stElementov == this.elementi.length) {
            T[] stariElementi = this.elementi;
            this.elementi = (T[]) new Object[2 * stariElementi.length];
            for (int i = 0;  i < this.stElementov;  i++) {
                this.elementi[i] = stariElementi[i];
            }
        }
    }

    // Vrne izpis vsebine vektorja this v obliki
    // [e_0, e_1, ..., e_{n-1}].
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0;  i < this.stElementov;  i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.elementi[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    // Implementacija metode iterator v vmesniku Iterable.
    @Override
    public Iterator<T> iterator() {
        return new IteratorCezVektor<T>(this);
    }

    // Iterator, ki ga vrne metoda iterator, je objekt tega razreda.

    private static class IteratorCezVektor<T> implements Iterator<T> {

        // vektor, po katerem se bo iterator (torej objekt tega razreda)
        // sprehajal
        private Vektor<T> vektor;

        // indeks naslednjega elementa, ki ga vrne metoda next
        private int indeks;

        public IteratorCezVektor(Vektor<T> vektor) {
            this.vektor = vektor;
            this.indeks = 0;
        }

        // Vrne true natanko v primeru, če še nismo prispeli do konca
        // vektorja, po katerem se sprehajamo
        @Override
        public boolean hasNext() {
            return this.indeks < this.vektor.steviloElementov();
        }

        // Vrne naslednji element vektorja in se obenem pripravi na naslednji
        // klic metod hasNext in next.
        @Override
        public T next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            return this.vektor.vrni(this.indeks++);
        }
    }
}
