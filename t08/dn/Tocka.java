import java.util.Locale;

public class Tocka {
    private double x;
    private double y;
    private static final Tocka IZHODISCE = new Tocka(0, 0);

    public Tocka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double vrniX() {
        return this.x;
    }

    public double vrniY() {
        return this.y;
    }

    // zaokroži na dve decimalki
    public String toString() {
        return String.format(Locale.US, "(%.2f, %.2f)", this.x, this.y);
    }

    public double razdalja(Tocka t) {
        return Math.sqrt(Math.pow(this.x - t.x, 2) + Math.pow(this.y - t.y, 2));
    }

    public static Tocka izhodisce() {
        return Tocka.IZHODISCE;
    }

    public double razdaljaOdIzhodisca() {
        return razdalja(izhodisce());
    }
}
