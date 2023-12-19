import java.util.Locale;

public class Premica {
    private double k;
    private double n;

    public Premica(double k, double n) {
        this.k = k;
        this.n = n;
    }

    public double vrniK() {
        return this.k;
    }

    public double vrniN() {
        return this.n;
    }

    public String toString() {
        return String.format(Locale.US, "y = %.2f x + %.2f", this.k, this.n);
    }

    public Tocka tockaPriX(double x) {
        return new Tocka(x, this.k * x + this.n);
    }

    public static Premica skoziTocko(double k, Tocka t) {
        return new Premica(k, t.vrniY() - k * t.vrniX());
    }

    public Premica vzporednica(Tocka t) {
        return Premica.skoziTocko(this.k, t);
    }

    public Premica pravokotnica(Tocka t) {
        return Premica.skoziTocko(-1.0 / this.k, t);
    }

    public Tocka presecisce(Premica p, double epsilon) {
        if (Math.abs(this.k - p.k) < epsilon) {
            return null;
        }
        double x = (p.n - this.n) / (this.k - p.k);
        return this.tockaPriX(x);
    }

    public Tocka projekcija(Tocka t) {
        Premica pravokotnica = this.pravokotnica(t);
        return this.presecisce(pravokotnica, 0.0);
    }

    public double razdalja(Tocka t) {
        return t.razdalja(this.projekcija(t));
    }

    public double razdaljaOdIzhodisca() {
        return this.razdalja(Tocka.izhodisce());
    }

    public double razdalja(double n) {
        Premica vzporednica = new Premica(this.k, n);
        Tocka t = vzporednica.tockaPriX(0.0);
        return this.razdalja(t);
    }
}
