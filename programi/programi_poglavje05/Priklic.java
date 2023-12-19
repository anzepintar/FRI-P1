
/*
 * Branje <n> števil in njihov ponovni izpis
 */

import java.util.Scanner;

public class Priklic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Koliko števil želite vnesti? ");
        int n = sc.nextInt();

        // ustvarimo tabelo, ki bo hranila elemente
        int[] stevila = new int[n];

        // beremo števila in jih shranjujemo v tabelo
        // (i-to število shranimo v i-ti element tabele)
        for (int i = 0;  i < n;  i++) {
            System.out.print("Vnesite število: ");
            stevila[i] = sc.nextInt();
        }

        // izpišemo števila, ki smo jih shranili v tabelo
        for (int stevilo: stevila) {
            System.out.println(stevilo);
        }
    }
}
