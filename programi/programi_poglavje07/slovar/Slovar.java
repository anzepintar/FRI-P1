
/*
 * Objekt tega razreda je slovar, predstavljen z zgoščeno tabelo.
 */

public class Slovar {

    // objekt tega razreda je eno od vozlišč v enem od povezanih seznamov
    // zgoščene tabele
    private static class Vozlisce {
        Object kljuc;
        Object vrednost;
        Vozlisce naslednje; // kazalec na naslednje vozlišče v povezanem seznamu

        Vozlisce(Object kljuc, Object vrednost, Vozlisce naslednje) {
            this.kljuc = kljuc;
            this.vrednost = vrednost;
            this.naslednje = naslednje;
        }
    }

    // podatki[i]: kazalec na prvo vozlišče povezanega seznama,
    // v katerem se vsi ključi preslikajo v indeks i
    private Vozlisce[] podatki;

    // privzeta dolžina tabele <podatki>
    private static final int PRIVZETA_VELIKOST_TABELE = 97;

    // Ustvari slovar s privzeto dolžino zgoščene tabele.
    public Slovar() {
        this(PRIVZETA_VELIKOST_TABELE);
    }

    // Ustvari slovar s podano dolžino zgoščene tabele.
    public Slovar(int velikostTabele) {
        this.podatki = new Vozlisce[velikostTabele];
    }

    // Vrne vrednost, ki pripada podanemu ključu, oziroma null, če ključa ni v
    // slovarju.
    public Object vrni(Object kljuc) {
        // poiščemo vozlišče, ki vsebuje podani ključ
        Vozlisce vozlisce = this.poisci(kljuc);
        if (vozlisce == null) {
            return null;
        }
        return vozlisce.vrednost;
    }

    // Če vozlišče s podanim ključem še ne obstaja, potem v slovar
    // shranimo nov par ključ-vrednost, sicer pa posodobimo vrednost
    // pri tem ključu.
    public void shrani(Object kljuc, Object vrednost) {
        Vozlisce vozlisce = this.poisci(kljuc);
        if (vozlisce != null) {
            // vozlišče že obstaja, zato posodobimo vrednost
            vozlisce.vrednost = vrednost;
        } else {
            // izdelati moramo novo vozlišče in ga vstaviti v
            // verigo
            int indeks = this.indeks(kljuc);
            Vozlisce novo = new Vozlisce(
                    kljuc, vrednost, this.podatki[indeks]);
            this.podatki[indeks] = novo;
        }
    }

    // Vrne kazalec na vozlišče, ki vsebuje podani ključ,
    // oziroma null, če takega vozlišča ni.

    private Vozlisce poisci(Object kljuc) {
        // indeks celice, v katero spada ključ
        int indeks = this.indeks(kljuc);

        // kazalec na prvo vozlišče v povezanem seznamu
        Vozlisce vozlisce = this.podatki[indeks];

        // potujemo po verigi, dokler ne pridemo bodisi do <null>
        // bodisi do vozlišča, v katerem se ključ ujema (equals)
        // s podanim ključem
        while (vozlisce != null && !vozlisce.kljuc.equals(kljuc)) {
            vozlisce = vozlisce.naslednje;
        }
        return vozlisce;
    }

    // Vrne indeks, v katerega se preslika podani ključ.
    private int indeks(Object kljuc) {
        int n = this.podatki.length;
        return ((kljuc.hashCode() % n) + n) % n;
    }
}
