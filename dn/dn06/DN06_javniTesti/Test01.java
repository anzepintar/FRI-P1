
public class Test01 {

    private static double EPSILON = 1e-7;

    public static void main(String[] args) {
        Tocka a = new Tocka(3.0, -1.0);
        Tocka b = new Tocka(-2.0, 2.0);
        preveri("Tocka/vrniX", a.vrniX(), 3.0);
        preveri("Tocka/vrniY", a.vrniY(), -1.0);
        preveri("Tocka/toString", a.toString(), "(3.00, -1.00)");
        preveri("Tocka/razdalja", a.razdalja(b), Math.sqrt(34.0));
        preveri("Tocka/izhodisce", Tocka.izhodisce(), new Tocka(0.0, 0.0));
        preveri("Tocka/razdaljaOdIzhodisca", a.razdaljaOdIzhodisca(), Math.sqrt(10.0));

        Premica p = new Premica(2.0, -1.0);
        Premica q = new Premica(-1.0, -4.0);
        preveri("Premica/vrniK", p.vrniK(), 2.0);
        preveri("Premica/vrniN", p.vrniN(), -1.0);
        preveri("Premica/toString", p.toString(), "y = 2.00 x + -1.00");
        preveri("Premica/tockaPriX", p.tockaPriX(3.0), new Tocka(3.0, 5.0));
        preveri("Premica/skoziTocko", Premica.skoziTocko(-3.0, a), new Premica(-3.0, 8.0));
        preveri("Premica/vzporednica", p.vzporednica(a), new Premica(2.0, -7.0));
        preveri("Premica/pravokotnica", p.pravokotnica(a), new Premica(-0.5, 0.5));
        preveri("Premica/presecisce", p.presecisce(q, EPSILON), new Tocka(-1.0, -3.0));
        preveri("Premica/projekcija", p.projekcija(a), new Tocka(0.6, 0.2));
        preveri("Premica/razdalja(Tocka)", p.razdalja(a), 6.0 * Math.sqrt(5.0) / 5.0);
        preveri("Premica/razdaljaOdIzhodisca", p.razdaljaOdIzhodisca(), Math.sqrt(5.0) / 5.0);
        preveri("Premica/razdalja(double)", p.razdalja(2.0), 3.0 * Math.sqrt(5.0) / 5.0);
    }

    private static void preveri(String besedilo, double dobljeno, double pricakovano) {
        izpisi(besedilo, steviliEnaki(pricakovano, dobljeno));
    }

    private static void preveri(String besedilo, String dobljeno, String pricakovano) {
        izpisi(besedilo, nizaEnaka(pricakovano, dobljeno));
    }

    private static void preveri(String besedilo, Tocka dobljeno, Tocka pricakovano) {
        izpisi(besedilo, tockiEnaki(pricakovano, dobljeno));
    }

    private static void preveri(String besedilo, Premica dobljeno, Premica pricakovano) {
        izpisi(besedilo, premiciEnaki(pricakovano, dobljeno));
    }

    private static boolean tockiEnaki(Tocka a, Tocka b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return steviliEnaki(a.vrniX(), b.vrniX()) && steviliEnaki(a.vrniY(), b.vrniY());
    }

    private static boolean premiciEnaki(Premica a, Premica b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return steviliEnaki(a.vrniK(), b.vrniK()) && steviliEnaki(a.vrniN(), b.vrniN());
    }

    private static boolean steviliEnaki(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }

    private static boolean nizaEnaka(String a, String b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.equals(b);
    }

    private static void izpisi(String besedilo, boolean sodba) {
        System.out.printf("%-27s --> %s%n", besedilo, sodba ? "OK" : "napaka");
    }
}
