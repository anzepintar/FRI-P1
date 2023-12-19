
/*
 * Testni razred za razred VektorInt.
 */

public class TestVektorInt {

    public static void main(String[] args) {
        VektorInt vektor = new VektorInt();
        vektor.dodaj(20);
        vektor.dodaj(7);
        vektor.dodaj(42);
        vektor.dodaj(11);
        vektor.dodaj(30);
        System.out.println(vektor.toString());

        vektor.vstavi(2, 60);
        System.out.println(vektor.toString());

        vektor.odstrani(1);
        System.out.println(vektor.toString());

        vektor.nastavi(3, 90);
        System.out.println(vektor.toString());
    }
}
