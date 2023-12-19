
/*
 * Razred za predstavitev vektorja, vsebovalnika, ki se z vidika uporabnika
 * obnaša kot "raztegljiva" tabela.  Tabele seveda ni mogoče raztezati, lahko
 * pa takrat, ko tabela postane pretesna, izdelamo novo, večjo tabelo in
 * obstoječe elemente prenesemo vanjo.
 *
 * Vektorji, ki pripadajo temu razredu, hranijo elemente tipa String.
 */

public class VektorString {

    private static final int ZACETNA_KAPACITETA = 10;

    // tabela, ki hrani elemente
    private String[] elementi;

    // dejansko število elementov v tabeli
    private int stElementov;

    public VektorString() {
        this(ZACETNA_KAPACITETA);  // pokliče konstruktor s parametrom <kapaciteta>
    }

    public VektorString(int kapaciteta) {
        this.elementi = new String[kapaciteta];
        this.stElementov = 0;  // odveč, a poveča jasnost
    }

    // Vrne število elementov vektorja this.
    public int steviloElementov() {
        return this.stElementov;
    }

    // Vrne element vektorja this na podanem indeksu.
    public String vrni(int indeks) {
        return this.elementi[indeks];
    }

    // Element na podanem indeksu nastavi na podano vrednost.
    public void nastavi(int indeks, String vrednost) {
        this.elementi[indeks] = vrednost;
    }

    // Doda element na konec vektorja (na indeks this.stElementov).
    public void dodaj(String vrednost) {
        this.poPotrebiPovecaj();
        this.elementi[this.stElementov] = vrednost;
        this.stElementov++;
    }

    // Vstavi element s podano vrednostjo pred element s podanim
    // indeksom.
    public void vstavi(int indeks, String vrednost) {
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
    private void poPotrebiPovecaj() {
        if (this.stElementov == this.elementi.length) {
            String[] stariElementi = this.elementi;
            this.elementi = new String[2 * stariElementi.length];
            for (int i = 0;  i < this.stElementov;  i++) {
                this.elementi[i] = stariElementi[i];
            }
        }
    }

    // Vrne vsebino vektorja <this> v obliki niza [e_0, e_1, ..., e_{n-1}].
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
