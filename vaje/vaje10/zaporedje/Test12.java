
public class Test12 {

    public static void main(String[] args) {
        int[] t = {3, -1, 2, -1, -1, 4, -1, 6, 7, -1, -1, 5, -1, -1, -1, 3, -1};
        Zaporedje tab = new Tabela(t);

        inverz(tab, new Interval(0, 10));
        inverz(tab, new Interval(0, 0));
        inverz(tab, new Interval(0, 4));
        inverz(tab, new Interval(3, 10));
        inverz(tab, new Interval(8, 16));
    }

    private static void inverz(Zaporedje z, Interval xRazpon) {
        Interval yRazpon = z.minMax(xRazpon);
        Zaporedje inv = z.inverz(xRazpon);
        System.out.println( (inv == null) ? ("null") : (inv.vNiz(yRazpon)) );
    }
}
