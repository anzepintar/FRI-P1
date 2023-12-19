
/*
 * Testni razred za razred Cas
 */

public class TestCas {

    public static void main(String[] args) {
        /* to se ne prevede, ker so atributi privatni
        Cas trenutek = new Cas();
        trenutek.ura = 10;
        trenutek.minuta = 35;
        */

        System.out.println("getterja");
        Cas trenutek = new Cas(10, 35);
        System.out.println(trenutek.vrniUro());
        System.out.println(trenutek.vrniMinuto());
        System.out.println();

        System.out.println("toString");
        System.out.println(trenutek.toString());
        System.out.println();

        System.out.println("pristejStatic");
        Cas.pristejStatic(trenutek, 2, 50);
        System.out.println(trenutek.toString());
        System.out.println();

        System.out.println("pristej");
        trenutek = new Cas(10, 35);
        trenutek.pristej(2, 50);
        System.out.println(trenutek.toString());
        System.out.println();

        System.out.println("plus");
        trenutek = new Cas(10, 35);
        Cas kosilo = trenutek.plus(2, 50);
        System.out.println(kosilo.toString());
        System.out.println(trenutek.toString());
        System.out.println();

        Cas a = new Cas(20, 10);
        Cas b = a;
        Cas c = new Cas(20, 10);
        Cas d = new Cas(20, 15);

        System.out.println("jeEnakKot");
        System.out.println(a.jeEnakKot(b));
        System.out.println(a.jeEnakKot(c));
        System.out.println(a.jeEnakKot(d));
        System.out.println();

        System.out.println("==");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println();

        System.out.println("razlikaVMin");
        Cas malica = new Cas(10, 0);
        Cas vecerja = new Cas(18, 30);
        System.out.println(vecerja.razlikaVMin(malica));
        System.out.println(malica.razlikaVMin(vecerja));
        System.out.println();

        System.out.println("jeManjsiOd");
        System.out.println(malica.jeManjsiOd(vecerja));
        System.out.println(vecerja.jeManjsiOd(malica));
        System.out.println(malica.jeManjsiOd(malica));
        System.out.println();

        System.out.println("jeManjsiAliEnakOd");
        System.out.println(malica.jeManjsiAliEnakOd(vecerja));
        System.out.println(vecerja.jeManjsiAliEnakOd(malica));
        System.out.println(malica.jeManjsiAliEnakOd(malica));
        System.out.println();

        System.out.println("nastaviZapis12");
        Cas.nastaviZapis12(true);
        System.out.println(malica.toString());
        System.out.println(vecerja.toString());
        Cas.nastaviZapis12(false);
        System.out.println(malica.toString());
        System.out.println(vecerja.toString());
    }
}
