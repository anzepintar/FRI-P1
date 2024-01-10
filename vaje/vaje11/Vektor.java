
public class Vektor<T> {

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
}
