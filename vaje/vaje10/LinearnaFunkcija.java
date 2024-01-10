
public class LinearnaFunkcija extends Zaporedje {

    private int k;
    private int n;

    public LinearnaFunkcija(int k, int n) {
        this.k = k;
        this.n = n;
    }

    @Override
    public Integer y(int x) {
        return (this.k * x + this.n);
    }
}
