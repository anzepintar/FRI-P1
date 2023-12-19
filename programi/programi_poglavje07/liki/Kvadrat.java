
/*
 * Objekt tega razreda predstavlja kvadrat.
 */

public class Kvadrat extends Pravokotnik {

    // atributa sirina in visina se podedujeta;
    // podedujejo se tudi vse metode

    public Kvadrat(double stranica) {
        // doseči želimo tole:
        // this.sirina = stranica;
        // this.visina = stranica;
        // žal pa se to ne prevede
        //
        // to lahko naredimo zgolj takole:
        super(stranica, stranica);
    }

    // Metod ploscina in obseg nam ni treba redefinirati,
    // saj se ploščina in obseg za kvadrate računata na enak način
    // kot za pravokotnike.

    @Override
    public String vrsta() {
        return "kvadrat";
    }

    @Override
    public String podatki() {
        return String.format("stranica = %.1f", this.vrniSirino());
    }
}
