
//
// Razred za predstavitev banke.
//

import java.util.*;

public class Banka {

    // komitenti banke /this/, dostopni prek njihovih šifer
    private Map<String, Komitent> komitenti;

    // računi, ki jih vodi banka /this/, dostopni prek njihovih šifer
    private Map<String, Racun> racuni;

    public Banka() {
        this.komitenti = new HashMap<>();
        this.racuni = new HashMap<>();
    }

    //
    // Banki /this/ dodeli novega komitenta s podano šifro in imenom.
    //
    public void dodajKomitenta(String sifra, String ime) {
        this.komitenti.put(sifra, new Komitent(sifra, ime));
    }

    //
    // Komitentu s podano šifro dodeli nov račun s podano šifro.
    //
    public void dodajRacun(String sifraKomitenta, String sifraRacuna) {
        Racun racun = new Racun(sifraRacuna);
        this.komitenti.get(sifraKomitenta).dodajRacun(racun);
        this.racuni.put(sifraRacuna, racun);
    }

    //
    // Na račun s podano šifro položi podani znesek.
    //
    public void polog(String sifraRacuna, int znesek) {
        this.racuni.get(sifraRacuna).dodaj(znesek);
    }

    //
    // Z računa s podano šifro dvigne podani znesek.
    //
    public void dvig(String sifraRacuna, int znesek) {
        this.racuni.get(sifraRacuna).dodaj(-znesek);
    }

    //
    // Prenese podani znesek z računa s šifro /sifraIzvor/ na račun s šifro
    // /sifraCilj/.
    //
    public void prenos(String sifraIzvor, String sifraCilj, int znesek) {
        Racun izvor = this.racuni.get(sifraIzvor);
        Racun cilj = this.racuni.get(sifraCilj);
        izvor.dodaj(-znesek);
        cilj.dodaj(znesek);
    }

    //
    // Vrne račun s podano šifro.
    //
    public Racun racun(String sifraRacuna) {
        return this.racuni.get(sifraRacuna);
    }

    //
    // Vrne komitenta s podano šifro.
    //
    public Komitent komitent(String sifraKomitenta) {
        return this.komitenti.get(sifraKomitenta);
    }
}
