
//
// Razred za predstavitev posameznih bančnih računov.
//

public class Racun {
    private String sifra;
    private int stanje;

    //
    // Inicializira novoustvarjeni objekt tako, da predstavlja prazen račun s
    // podano šifro.
    //
    public Racun(String sifra) {
        this.sifra = sifra;
        this.stanje = 0;
    }

    //
    // Vrne šifro računa /this/.
    //
    public String vrniSifro() {
        return this.sifra;
    }

    //
    // Vrne stanje računa /this/.
    //
    public int vrniStanje() {
        return this.stanje;
    }

    //
    // Stanje računa /this/ poveča za podani znesek.
    //
    public void dodaj(int znesek) {
        this.stanje += znesek;
    }

    //
    // Vrne niz, ki podaja šifo in stanje računa /this/.
    //
    @Override
    public String toString() {
        return String.format("%s: %s", this.sifra, this.stanje);
    }
}
