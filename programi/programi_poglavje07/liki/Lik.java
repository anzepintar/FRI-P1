
/*
 * Objekt tega razreda predstavlja geometrijski lik.
 */

public abstract class Lik {

    // prevajalnik sam doda tole:
    // public Lik() {}

    // Vrne ploščino lika <this>.  To metodo potrebujemo zato, ker bi se radi
    // sprehodili po tabeli tipa Lik[] in za vsak lik v njej izračunali
    // ploščino, čeprav noben kazalec v tej tabeli ne bo kazal na objekt tipa
    // Lik (ampak Pravokotnik, Kvadrat ali Krog). 
    public abstract double ploscina();

    // Vrne obseg lika <this>.
    public abstract double obseg();

    // Vrne niz, ki vsebuje vrsto lika <this> in podatke o njem.
    public String toString() {
        return String.format("%s [%s]", this.vrsta(), this.podatki());
    }

    // Vrne vrsto lika <this> (npr. "pravokotnik").
    public abstract String vrsta();

    // Vrne niz s podatki o liku <this> 
    // (npr. "širina = 3.0, višina = 4.0").
    public abstract String podatki();
}
