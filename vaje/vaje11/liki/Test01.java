
public class Test01 {

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

        Skupno.uredi(liki);
        Lik.izpisi(liki);
    }
}
