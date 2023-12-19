
/*
 * Testni razred za razred Vektor. Testiramo zgolj skladnost tipov, ostalo smo
 * že preverili.
 */

public class TestVektor {

    public static void main(String[] args) {
        Vektor<String> nizi = new Vektor<String>();
        nizi.dodaj("dober dan");
        nizi.dodaj("tralala");
        // nizi.dodaj(123);  // se ne prevede

        String niz = nizi.vrni(0);
        System.out.println(niz);

        // Integer stevilo = nizi.vrni(1);  // se ne prevede
    }
}
