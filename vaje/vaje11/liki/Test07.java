
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Vektor<Lik> liki = new Vektor<>();
        liki.dodaj(new Krog(7));
        liki.dodaj(new Pravokotnik(12, 3));
        liki.dodaj(new Kvadrat(5));
        liki.dodaj(new Pravokotnik(8, 9));
        liki.dodaj(new Kvadrat(7));
        liki.dodaj(new Pravokotnik(5, 15));
        liki.dodaj(new Pravokotnik(15, 7));
        liki.dodaj(new Krog(5));
        liki.dodaj(new Pravokotnik(7, 6));
        liki.dodaj(new Kvadrat(10));
        liki.dodaj(new Krog(6));
        liki.dodaj(new Kvadrat(8));
        liki.dodaj(new Pravokotnik(20, 5));
        liki.dodaj(new Pravokotnik(16, 4));
        liki.dodaj(new Kvadrat(11));
        liki.dodaj(new Pravokotnik(1, 14));
        liki.dodaj(new Pravokotnik(9, 11));
        liki.dodaj(new Krog(8));
        liki.dodaj(new Pravokotnik(8, 17));
        liki.dodaj(new Krog(1));
        liki.dodaj(new Pravokotnik(7, 8));
        liki.dodaj(new Kvadrat(1));
        liki.dodaj(new Pravokotnik(12, 8));
        liki.dodaj(new Pravokotnik(5, 10));
        liki.dodaj(new Pravokotnik(2, 1));

        // primarno po obsegu, sekundarno po tipu
        Skupno.uredi(liki, Skupno.kompozitum(Lik.poObsegu(), Lik.poTipu()));
        Lik.izpisi(liki);
        System.out.println();

        // primarno po tipu, sekundarno po obsegu, terciarno po ploščini
        Skupno.uredi(liki, Skupno.kompozitum(Lik.poObsegu(), Lik.poTipu()));
        Skupno.uredi(liki,
            Skupno.kompozitum(Lik.poTipu(),
                Skupno.kompozitum(Lik.poObsegu(), new NaravniPrimerjalnik<Lik>())));

        Lik.izpisi(liki);
    }

    private static class NaravniPrimerjalnik<T extends Comparable<T>>
            implements Comparator<T> {

        @Override
        public int compare(T a, T b) {
            return a.compareTo(b);
        }
    }
}
