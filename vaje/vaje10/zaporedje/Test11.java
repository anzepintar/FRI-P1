
public class Test11 {

    public static void main(String[] args) {
        Zaporedje lin1 = new LinearnaFunkcija(3, 1);
        Zaporedje lin2 = new LinearnaFunkcija(-5, 2);

        Zaporedje sin1 = new Sinus(10, Math.PI / 4.0);
        Zaporedje sin2 = new Sinus(20, Math.PI / 3.0);
        Zaporedje sin3 = new Sinus(20, Math.PI / 30.0);

        inverz(lin1, new Interval(-5, 5));
        inverz(lin2, new Interval(-5, 5));
        inverz(sin1, new Interval(0, 10));
        inverz(sin2, new Interval(0, 10));
        inverz(sin3, new Interval(0, 10));
    }

    private static void inverz(Zaporedje z, Interval xRazpon) {
        Interval yRazpon = z.minMax(xRazpon);
        Zaporedje inv = z.inverz(xRazpon);
        System.out.println( (inv == null) ? ("null") : (inv.vNiz(yRazpon)) );
    }
}
