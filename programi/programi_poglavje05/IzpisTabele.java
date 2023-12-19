
/*
 * Izpis tabele samoglasnikov z zanko po indeksih in zanko po elementih
 * (for-each)
 */

public class IzpisTabele {

    public static void main(String[] args) {
        char[] samoglasniki = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0;  i < samoglasniki.length;  i++) {
            System.out.printf("Element na indeksu %d: %c%n", i, samoglasniki[i]);
        }
        System.out.println();

        for (char crka: samoglasniki) {
            System.out.println(crka);
        }
    }
}
