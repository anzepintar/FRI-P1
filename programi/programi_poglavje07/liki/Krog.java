
/*
 * Objekt tega razreda predstavlja krog.
 */

public class Krog extends Lik {

    private double polmer;

    public Krog(double polmer) {
        this.polmer = polmer;
    }

    @Override
    public double ploscina() {
        return Math.PI * this.polmer * this.polmer;
    }

    @Override
    public double obseg() {
        return 2.0 * Math.PI * this.polmer;
    }

    @Override
    public String vrsta() {
        return "krog";
    }

    @Override
    public String podatki() {
        return String.format("polmer = %.1f", this.polmer);
    }
}
