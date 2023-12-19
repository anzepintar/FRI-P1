
/*
 * Razred za predstavitev vektorja, vsebovalnika, ki se z vidika uporabnika
 * obnaša kot "raztegljiva" tabela.  Tabele seveda ni mogoče raztezati, lahko
 * pa takrat, ko tabela postane pretesna, izdelamo novo, večjo tabelo in
 * obstoječe elemente prenesemo vanjo.
 *
 * Vektorji, ki pripadajo temu razredu, hranijo elemente tipa int.
 */

public class VektorInt {

    private static final int ZACETNA_KAPACITETA = 10;

    // tabela, ki hrani elemente
    // (kapaciteta vektorja je dolžina te tabele)
    private int[] elementi;

    // dejansko število elementov v tabeli
    private int stElementov;

    public VektorInt() {
        this(ZACETNA_KAPACITETA);  // pokliče konstruktor s parametrom <kapaciteta>
    }

    public VektorInt(int kapaciteta) {
        this.elementi = new int[kapaciteta];
        this.stElementov = 0;   // odveč, a poveča jasnost
    }

    // Vrne dejansko število elementov vektorja <this>.
    public int steviloElementov() {
        return this.stElementov;
    }

    // Vrne element vektorja <this> na podanem indeksu.
    public int vrni(int indeks) {
        return this.elementi[indeks];
        /*
        // bolje:
        if (indeks < 0 || indeks >= this.stElementov) {
            throw new RuntimeException("Neveljaven indeks!");
        }
        return this.elementi[indeks];
        */
    }

    // Nastavi element na podanem indeksu na podano vrednost.
    public void nastavi(int indeks, int vrednost) {
        this.elementi[indeks] = vrednost;
    }

    // Doda element na konec vektorja <this> (na indeks this.stElementov).
    public void dodaj(int vrednost) {
        this.poPotrebiPovecaj();
        this.elementi[this.stElementov] = vrednost;
        this.stElementov++;
    }

    // Če je tabela zapolnjena, jo "poveča" (ustvari novo tabelo in vanjo
    // skopira elemente iz trenutne tabele), sicer pa ne naredi ničesar.
    private void poPotrebiPovecaj() {
        if (this.stElementov == this.elementi.length) {
            int[] stariElementi = this.elementi;
            this.elementi = new int[2 * stariElementi.length];
            for (int i = 0;  i < this.stElementov;  i++) {
                this.elementi[i] = stariElementi[i];
            }
        }
    }

    // Vstavi podani element pred element s podanim indeksom.
    public void vstavi(int indeks, int vrednost) {
        this.poPotrebiPovecaj();
        for (int i = this.stElementov - 1;  i >= indeks;  i--) {
            this.elementi[i + 1] = this.elementi[i];
        }
        this.elementi[indeks] = vrednost;
        this.stElementov++;
    }

    // Odstrani element na podanem indeksu.
    public void odstrani(int indeks) {
        for (int i = indeks;  i < this.stElementov - 1;  i++) {
            this.elementi[i] = this.elementi[i + 1];
        }
        this.stElementov--;
    }

    /* Ta metoda sicer deluje, a je zaradi nespremenljivosti
     * objektov tipa String neučinkovita.
    // Vrne vsebino vektorja <this> v obliki niza [e_0, e_1, ..., e_{n-1}].
    public String toString() {
        String str = "[";
        for (int i = 0;  i < this.stElementov;  i++) {
            if (i > 0) {
                str += ", ";
            }
            str += Integer.toString(this.elementi[i]);
        }
        str += "]";
        return str;
    }
     */

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
