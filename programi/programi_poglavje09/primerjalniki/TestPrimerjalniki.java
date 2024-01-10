
import java.util.*;

/*
 * Razred, ki testira primerjalnike s pomočjo urejanja.
 */

public class TestPrimerjalniki {

    public static void main(String[] args) {
        Vektor<Cas> casi = new Vektor<>();
        casi.dodaj(new Cas(20, 10));
        casi.dodaj(new Cas(10, 55));
        casi.dodaj(new Cas(15, 40));
        casi.dodaj(new Cas(7, 20));
        casi.dodaj(new Cas(0, 33));
        casi.dodaj(new Cas(11, 50));
        casi.dodaj(new Cas(7, 5));

        // uredi objekte tipa Cas po njihovi naravni urejenosti (kronološko)
        Urejanje.uredi(casi);
        System.out.println(casi);
        System.out.println();

        Vektor<Oseba> osebe = new Vektor<>();
        osebe.dodaj(new Oseba("Jože", "Gorišek", 'M', 1960));
        osebe.dodaj(new Oseba("Marija", "Gorišek", 'Z', 1962));
        osebe.dodaj(new Oseba("Jože", "Debeljak", 'M', 1958));
        osebe.dodaj(new Oseba("Eva", "Petrič", 'Z', 1984));
        osebe.dodaj(new Oseba("Bojan", "Petrič", 'M', 1982));

        // uredi osebe po njihovi naravni urejenosti (primarno po priimku,
        // sekundarno po imenu)
        System.out.println("Naravno:");
        Urejanje.uredi(osebe);
        izpisi(osebe);
        System.out.println();

        osebe.dodaj(new Oseba("Ana", "Petrič", 'Z', 1990));
        osebe.dodaj(new Oseba("Bojan", "Gorišek", 'M', 1955));

        // uredi osebe po priimku
        System.out.println("Po priimku:");
        Urejanje.uredi(osebe, Oseba.primerjalnikPoPriimku());
        izpisi(osebe);
        System.out.println();

        // uredi osebe primarno po spolu, sekundarno pa po starosti
        System.out.println("Po spolu in starosti:");
        Urejanje.uredi(osebe, Oseba.primerjalnikPoSpoluInStarosti());
        izpisi(osebe);
    }

    private static <T> void izpisi(Vektor<T> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 0;  i < stElementov;  i++) {
            System.out.println(vektor.vrni(i));
        }
    }
}
