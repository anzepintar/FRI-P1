
/*
 * Razred za preizkus hierarhije likov
 */

public class Glavni {

    public static void main(String[] args) {
        Lik[] liki = {
            new Kvadrat(7.0),
            new Pravokotnik(8.0, 9.0),
            new Krog(6.0),
            new Pravokotnik(9.0, 3.0),
            new Kvadrat(10.0),
            new Pravokotnik(6.0, 5.0),
            new Krog(4.0),
        };

        izpisiPodatke(liki);
        System.out.println();

        Lik najvecjiLik = likZNajvecjoPloscino(liki);
        System.out.println(najvecjiLik.toString());
        System.out.println();

        Pravokotnik najsirsiPravokotnik = pravokotnikZNajvecjoSirino(liki);
        System.out.println(najsirsiPravokotnik.toString());
    }

    // Izpiše podatke o vseh likih v podani tabeli.
    public static void izpisiPodatke(Lik[] liki) {
        for (Lik lik: liki) {
            System.out.printf("%s | p = %.1f, o = %.1f%n",
                    lik.toString(), lik.ploscina(), lik.obseg());
        }
    }

    // Vrne kazalec na tisti lik v podani tabeli, ki ima največjo ploščino.
    public static Lik likZNajvecjoPloscino(Lik[] liki) {
        // kazalec na doslej največji lik
        Lik najLik = null;
        double najPloscina = 0.0;

        for (Lik lik: liki) {
            double ploscina = lik.ploscina();
            if (najLik == null || ploscina > najPloscina) {
                najLik = lik;
                najPloscina = ploscina;
            }
        }
        return najLik;
    }

    // Vrne kazalec na tisti pravokotnik v podani tabeli, ki ima največjo
    // širino.
    public static Pravokotnik pravokotnikZNajvecjoSirino(Lik[] liki) {
        Pravokotnik naj = null;
        for (Lik lik: liki) {
            if (lik instanceof Pravokotnik) {
                Pravokotnik p = (Pravokotnik) lik;
                if (naj == null || p.vrniSirino() > naj.vrniSirino()) {
                    naj = p;
                }
            }
        }
        return naj;
    }
}
