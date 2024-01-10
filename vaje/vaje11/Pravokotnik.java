
public class Pravokotnik extends Lik {

    private int sirina;
    private int visina;

    public Pravokotnik(int sirina, int visina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    public int vrniSirino() {
        return this.sirina;
    }

    @Override
    public int ploscina() {
        return this.sirina * this.visina;
    }

    @Override
    public int obseg() {
        return 2 * (this.sirina + this.visina);
    }

    @Override
    public String vrsta() {
        return "pravokotnik";
    }

    @Override
    public String podatki() {
        return String.format("sirina = %d, visina = %d", this.sirina, this.visina);
    }
}
