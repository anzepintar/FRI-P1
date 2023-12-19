
/*
 * Objekt tega razreda predstavlja pravokotnik.
 */

public class Pravokotnik extends Lik {

    private double sirina;
    private double visina;

    public Pravokotnik(double sirina, double visina) {
        // prevajalnik sam doda tole:
        // super();
        this.sirina = sirina;
        this.visina = visina;
    }

    public double vrniSirino() {
        return this.sirina;
    }

    @Override
    public double ploscina() {
        return this.sirina * this.visina;
    }

    @Override
    public double obseg() {
        return 2.0 * (this.sirina + this.visina);
    }

    @Override
    public String vrsta() {
        return "pravokotnik";
    }

    @Override
    public String podatki() {
        return String.format("širina = %.1f, višina = %.1f",
                this.sirina, this.visina);
    }
}
