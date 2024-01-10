public class Vsota extends Zaporedje {
    private Zaporedje f;
    private Zaporedje g;

    public Vsota(Zaporedje f, Zaporedje g) {
        this.f = f;
        this.g = g;
    }

    @Override
    public Integer y(int x) {
        if (this.f.y(x) == null || this.g.y(x) == null)
            return null;
        return this.f.y(x) + this.g.y(x);
    }
}
