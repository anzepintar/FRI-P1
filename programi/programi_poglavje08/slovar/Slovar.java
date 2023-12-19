
/*
 * Objekt tega razreda predstavlja slovar s ključi tipa K in vrednostmi tipa V.
 */

public class Slovar<K, V> {

    // objekt tega razreda je eno od vozlišč v enem od povezanih seznamov
    // zgoščene tabele
    private static class Vozlisce<K, V> {
        K kljuc;
        V vrednost;
        Vozlisce<K, V> naslednje;   // kazalec na naslednje vozlišče v povezanem seznamu

        Vozlisce(K kljuc, V vrednost, Vozlisce<K, V> naslednje) {
            this.kljuc = kljuc;
            this.vrednost = vrednost;
            this.naslednje = naslednje;
        }
    }

    // podatki[i]: kazalec na prvo vozlišče povezanega seznama,
    // v katerem se vsi ključi preslikajo v indeks i
    private Vozlisce<K, V>[] podatki;

    private static final int PRIVZETA_VELIKOST_TABELE = 97;
    
    public Slovar() {
        this(PRIVZETA_VELIKOST_TABELE);
    }

    @SuppressWarnings("unchecked")
    public Slovar(int velikostTabele) {
        this.podatki = (Vozlisce<K, V>[]) new Vozlisce<?, ?>[velikostTabele];
    }

    // Vrne vrednost, ki pripada podanemu ključu, oziroma null, če ključa ni v
    // slovarju.
    public V vrni(K kljuc) {
        // poiščemo vozlišče, ki vsebuje podani ključ
        Vozlisce<K, V> vozlisce = this.poisci(kljuc);
        if (vozlisce == null) {
            return null;
        }
        return vozlisce.vrednost;
    }

    // Če vozlišče s podanim ključem še ne obstaja, potem v slovar
    // shranimo nov par ključ-vrednost, sicer pa posodobimo vrednost
    // pri tem ključu.
    public void shrani(K kljuc, V vrednost) {
        Vozlisce<K, V> vozlisce = this.poisci(kljuc);
        if (vozlisce != null) {
            // vozlišče že obstaja, zato posodobimo vrednost
            vozlisce.vrednost = vrednost;
        } else {
            // izdelati moramo novo vozlišče in ga vstaviti v
            // verigo
            int indeks = this.indeks(kljuc);
            Vozlisce<K, V> novo = new Vozlisce<>(
                    kljuc, vrednost, this.podatki[indeks]);
            this.podatki[indeks] = novo;
        }
    }

    // Vrne kazalec na vozlišče, ki vsebuje podani ključ,
    // oziroma null, če takega vozlišča ni.

    private Vozlisce<K, V> poisci(K kljuc) {
        // indeks celice, v katero spada ključ
        int indeks = this.indeks(kljuc);  

        // kazalec na prvo vozlišče v povezanem seznamu
        Vozlisce<K, V> vozlisce = this.podatki[indeks];

        // potujemo po verigi, dokler ne pridemo bodisi do <null>
        // bodisi do vozlišča, v katerem se ključ ujema (equals)
        // s podanim ključem
        while (vozlisce != null && !vozlisce.kljuc.equals(kljuc)) {
            vozlisce = vozlisce.naslednje;
        }
        return vozlisce;
    }

    // Vrne indeks, v katerega se preslika podani ključ.
    private int indeks(K kljuc) {
        int n = this.podatki.length;
        return ((kljuc.hashCode() % n) + n) % n;
    }
}
