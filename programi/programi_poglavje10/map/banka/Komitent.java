
//
// Razred za predstavitev posameznih bančnih komitentov.
//

import java.util.*;

public class Komitent {
    private String sifra;
    private String ime;

    // računi komitenta /this/, dostopni prek njihovih šifer
    private Map<String, Racun> racuni;

    //
    // Inicializira novoustvarjeni objekt tako, da predstavlja komitenta s
    // podano šifro in imenom.
    //
    public Komitent(String sifra, String ime) {
        this.sifra = sifra;
        this.ime = ime;
        this.racuni = new HashMap<>();
    }

    //
    // Komitentu /this/ dodeli podani račun.
    //
    public void dodajRacun(Racun racun) {
        this.racuni.put(racun.vrniSifro(), racun);
    }

    //
    // Vrne niz, ki podaja komitentovo ime in seznam njegovih računov.
    //
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ime);
        for (Racun racun: this.racuni.values()) {
            sb.append(" | " + racun.toString());
        }
        return sb.toString();
    }
}
