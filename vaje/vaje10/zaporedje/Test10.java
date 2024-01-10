
public class Test10 {

    public static void main(String[] args) {
        Zaporedje kvadrat = new Kvadrat();
        Zaporedje koren = new Koren();

        inverz(kvadrat, new Interval(-5, 5));
        inverz(kvadrat, new Interval(3, 7));
        inverz(kvadrat, new Interval(0, 10));
        System.out.println("----------");

        inverz(koren, new Interval(-5, 5));
        inverz(koren, new Interval(0, 10));
        inverz(koren, new Interval(0, 100));
    }

    private static void inverz(Zaporedje z, Interval xRazpon) {
        Interval yRazpon = z.minMax(xRazpon);
        Zaporedje inv = z.inverz(xRazpon);
        System.out.println( (inv == null) ? ("null") : (inv.vNiz(yRazpon)) );
    }
}
