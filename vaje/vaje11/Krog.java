
public class Krog extends Lik {

    private int polmer;

    public Krog(int polmer) {
        this.polmer = polmer;
    }

    @Override
    public int ploscina() {
        return (int) Math.round(Math.PI * this.polmer * this.polmer);
    }

    @Override
    public int obseg() {
        return (int) Math.round(2.0 * Math.PI * this.polmer);
    }

    @Override
    public String vrsta() {
        return "krog";
    }

    @Override
    public String podatki() {
        return String.format("polmer = %d", this.polmer);
    }
}
